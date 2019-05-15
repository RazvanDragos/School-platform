package com.example.demo2.service.converters;

import com.example.demo2.dto.CourseDTO;
import com.example.demo2.model.Course;

public class CourseConverter implements Converter<Course, CourseDTO> {

    @Override
    public Course dtoToModel(CourseDTO courseDTO) {
        return new Course(
            courseDTO.courseID,
            courseDTO.name,
            courseDTO.credits,
            courseDTO.exam,
            courseDTO.professors
        );
    }

    @Override
    public CourseDTO modelToDto(Course course) {
        return new CourseDTO(
                course.getCourseID(),
                course.getName(),
                course.getCredits(),
                course.getExam(),
                course.getProfessors()
        );
    }
}
