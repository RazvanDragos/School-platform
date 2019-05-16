package com.example.demo2.service.converters;

import com.example.demo2.dto.StudentDTO;
import com.example.demo2.model.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter implements Converter<Student, StudentDTO>{

    @Override
    public Student dtoToModel(StudentDTO studentDTO) {
        return new Student(
                studentDTO.studentID,
                studentDTO.firstName,
                studentDTO.lastName,
                studentDTO.age,
                studentDTO.email,
                studentDTO.phone,
                studentDTO.courses
        );
    }

    @Override
    public StudentDTO modelToDto(Student student) {
        return new StudentDTO(
                student.getStudentID(),
                student.getFirstName(),
                student.getLastName(),
                student.getAge(),
                student.getEmail(),
                student.getPhone(),
                student.getCourses()
        );
    }
}
