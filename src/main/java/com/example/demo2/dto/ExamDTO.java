package com.example.demo2.dto;

import com.example.demo2.model.Grade;

import java.util.Date;

public class ExamDTO {
    public Long examID;
    public String name;
    public Date date;
    public Grade grade;
    public String result;

    public ExamDTO(Long examID, String name, Date date, Grade grade, String result) {
        this.examID = examID;
        this.name = name;
        this.date = date;
        this.grade = grade;
        this.result = result;
    }
}
