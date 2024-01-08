package com.micro.microserviceexam.Professor.Controller;

import com.micro.microserviceexam.Professor.Service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professors")
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;


}
