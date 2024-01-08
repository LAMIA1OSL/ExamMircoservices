package com.micro.microserviceexam.Student.Repository;

import com.micro.microserviceexam.Student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
