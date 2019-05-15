package com.example.demo2.dto;

import com.example.demo2.model.Exam;
import com.example.demo2.model.Professor;

import java.util.List;

public class CourseDTO {
    public Long courseID;
    public String name;
    public int credits;
    public Exam exam;
    public List<Professor> professors;

    public CourseDTO(Long courseID, String name, int credits, Exam exam, List<Professor> professors) {
        this.courseID = courseID;
        this.name = name;
        this.credits = credits;
        this.exam = exam;
        this.professors = professors;
    }
}
