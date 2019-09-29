package t1708m.asignment_spring.service;
import t1708m.asignment_spring.entity.Student;
import org.springframework.data.domain.Page;

public interface StudentService {
    Page<Student> getList(int page, int limit);

    Student findByEmail(String email);

    Student login(String email, String password);

    Student register(Student student);

    Student update(String email, Student student);

    Student findById(int studentId);
}
