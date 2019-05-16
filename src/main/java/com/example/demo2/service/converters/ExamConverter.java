package com.example.demo2.service.converters;

import com.example.demo2.dto.ExamDTO;
import com.example.demo2.model.Exam;
import org.springframework.stereotype.Component;

@Component
public class ExamConverter implements Converter <Exam, ExamDTO>{

    @Override
    public Exam dtoToModel(ExamDTO examDTO) {
        return new Exam(
                examDTO.examID,
                examDTO.name,
                examDTO.date,
                examDTO.grade,
                examDTO.result
        );
    }

    @Override
    public ExamDTO modelToDto(Exam exam) {
        return new ExamDTO(
                exam.getExamID(),
                exam.getName(),
                exam.getDate(),
                exam.getGrade(),
                exam.getResult()
        );
    }
}
