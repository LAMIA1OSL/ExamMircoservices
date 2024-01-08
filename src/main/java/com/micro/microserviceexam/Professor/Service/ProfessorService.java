package com.micro.microserviceexam.Professor.Service;

import com.micro.microserviceexam.Professor.Repository.ProfessorRepository;
import com.micro.microserviceexam.Professor.model.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    public Professor getProfessorById(Long id) {
        return professorRepository.findById(id).orElse(null);
    }

    public Professor createProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    public Professor updateProfessor(Long id, Professor updatedProfessor) {
        Professor existingProfessor = professorRepository.findById(id).orElse(null);
        if (existingProfessor != null) {
            existingProfessor.setName(updatedProfessor.getName());
            return professorRepository.save(existingProfessor);
        }
        return null;
    }

    public void deleteProfessor(Long id) {
        professorRepository.deleteById(id);
    }
}

