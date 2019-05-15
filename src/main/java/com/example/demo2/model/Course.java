package com.example.demo2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "course")
@NoArgsConstructor
@Getter
@Setter
class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseID;

    @Column
    @NotBlank
    private String name;

    @Column
    @NotBlank
    private int credits;

    @OneToOne
    @JoinColumn(name = "examID")
    private Exam exam;

    @ManyToMany(mappedBy = "courses")
    private List<Professor> professors;

    public Course(@NotBlank String name, @NotBlank int credits, Exam exam, List<Professor> professors) {
        this.name = name;
        this.credits = credits;
        this.exam = exam;
        this.professors = professors;
    }
}
