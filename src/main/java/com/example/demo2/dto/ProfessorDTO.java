package com.example.demo2.dto;

public class ProfessorDTO {
    public Long professorID;
    public String firstName;
    public String lastName;
    public int age;
    public String email;
    private Long phone;

    public ProfessorDTO(Long professorID, String firstName, String lastName, int age, String email, Long phone) {
        this.professorID = professorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }
}
