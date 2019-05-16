package com.example.demo2.service.converters;

import com.example.demo2.dto.ProfessorDTO;
import com.example.demo2.model.Professor;
import org.springframework.stereotype.Component;

@Component
public class ProfessorConverter implements Converter<Professor, ProfessorDTO> {

    @Override
    public Professor dtoToModel(ProfessorDTO professorDTO) {
        return new Professor(
                professorDTO.professorID,
                professorDTO.firstName,
                professorDTO.lastName,
                professorDTO.age,
                professorDTO.email,
                professorDTO.phone
        );
    }

    @Override
    public ProfessorDTO modelToDto(Professor professor) {
        return new ProfessorDTO(
                professor.getProfessorID(),
                professor.getFirstName(),
                professor.getLastName(),
                professor.getAge(),
                professor.getEmail(),
                professor.getPhone()
        );
    }
}
