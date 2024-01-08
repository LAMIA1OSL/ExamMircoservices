package com.micro.microserviceexam.Student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String classe;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClasse() {
        return classe;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
// Getters and setters
}
