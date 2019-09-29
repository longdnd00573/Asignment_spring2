package t1708m.asignment_spring.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import t1708m.asignment_spring.entity.Student;

import java.util.Optional;

public interface StudentReponsitory extends JpaRepository<Student, Integer> {
    Optional<Student> findByEmail(String email);
}
