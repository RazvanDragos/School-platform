package com.example.demo2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "professor")
@NoArgsConstructor
@Getter
@Setter
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long professor_id;

    @Column
    @NotBlank
    private String firstName;

    @Column
    @NotBlank
    private String lastName;

    @Column
    @NotBlank
    private int age;

    @Column
    @NotBlank
    private String email;

    @Column
    @NotBlank
    private Long phone;

    @ManyToMany
    @JoinTable(
            name = "professor_course",
            joinColumns = {@JoinColumn(name = "professor_id") },
            inverseJoinColumns = {@JoinColumn(name = "course_id")}
    )
    private List<Course> courses;

    public Professor(@NotBlank String firstName, @NotBlank String lastName, @NotBlank int age, @NotBlank String email, @NotBlank Long phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }
}
