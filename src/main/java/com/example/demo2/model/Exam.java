package com.example.demo2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "exam")
@NoArgsConstructor
@Getter
@Setter
class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long exam_id;

    @Column
    @NotBlank
    private String name;

    @Column
    @NotBlank
    private Date date;

    @Column
    @NotBlank
    private Grade grade;

    @Column
    @NotBlank
    private String result;

    public Exam(@NotBlank String name, @NotBlank Date date, @NotBlank Grade grade, @NotBlank String result) {
        this.name = name;
        this.date = date;
        this.grade = grade;
        this.result = result;
    }
}
