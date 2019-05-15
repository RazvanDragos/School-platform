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
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long examID;

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

    public Exam(Long examID, @NotBlank String name, @NotBlank Date date, @NotBlank Grade grade, @NotBlank String result) {
        this.examID = examID;
        this.name = name;
        this.date = date;
        this.grade = grade;
        this.result = result;
    }
}
