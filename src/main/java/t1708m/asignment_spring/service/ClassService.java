package t1708m.asignment_spring.service;

import t1708m.asignment_spring.entity.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class ClassService {
    @Autowired
    ClassRepository classRepository;

    public Page<Class> getList(int page, int limit) {
        return classRepository.findAll(PageRequest.of(page - 1, limit));
    }

    public Class getDetail(int id) {
        return classRepository.findById(id).orElse(null);
    }

    public Class save(Class classes){
        return classRepository.save(classes);
    }}
