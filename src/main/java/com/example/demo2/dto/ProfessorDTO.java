package com.example.demo2.dto;

import com.example.demo2.model.Course;

import java.util.List;

public class ProfessorDTO {
    public Long professorID;
    public String firstName;
    public String lastName;
    public int age;
    public String email;
    public Long phone;
    public List<Course> courses;

    public ProfessorDTO(Long professorID, String firstName, String lastName, int age, String email, Long phone, List<Course> courses) {
        this.professorID = professorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.courses = courses;
    }
}
