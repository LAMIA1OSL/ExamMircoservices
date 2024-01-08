package com.micro.microserviceexam.Professor.Repository;

import com.micro.microserviceexam.Professor.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
