package com.example.demo2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "student")
@NoArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @NotBlank
    private String firstName;

    @Column
    @NotBlank
    private String lastName;

    @Column
    @NotBlank
    private String email;

    @Column
    @NotBlank
    private int age;

    /*private List<Professor> professors;

    private List<Course> courses;

    private List<Exam> exams;

    public Student(@NotBlank String firstName, @NotBlank String lastName, @NotBlank String email, @NotBlank int age, List<Professor> professors, List<Course> courses, List<Exam> exams) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.professors = professors;
        this.courses = courses;
        this.exams = exams;
    }*/
}
