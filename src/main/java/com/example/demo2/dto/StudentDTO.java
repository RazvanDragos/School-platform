package com.example.demo2.dto;

public class StudentDTO {
    public Long studentID;
    public String firstName;
    public String lastName;
    public int age;
    public String email;
    public Long phone;

    public StudentDTO(Long studentID, String firstName, String lastName, int age, String email, Long phone) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }
}
