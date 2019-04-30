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
    private Long course_id;

    @Column
    @NotBlank
    private String name;

    @ManyToMany(mappedBy = "courses")
    private List<Professor> professors;

    @Column
    @NotBlank
    private int credits;

    @OneToOne
    @JoinColumn(name = "exam_id")
    private Exam exam;

    public Course(@NotBlank String name, List<Professor> professors, @NotBlank int credits, Exam exam) {
        this.name = name;
        this.professors = professors;
        this.credits = credits;
        this.exam = exam;
    }
}
