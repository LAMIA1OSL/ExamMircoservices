package com.micro.microserviceexam.Professor.Service;

import com.micro.microserviceexam.Professor.Repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    
}
