package com.example.demo2.service;

import com.example.demo2.dto.ProfessorDTO;
import com.example.demo2.exception.NotFoundException;
import com.example.demo2.model.Professor;
import com.example.demo2.repository.ProfessorRepository;
import com.example.demo2.service.converters.ProfessorConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    private final ProfessorRepository professorRepository;
    private final ProfessorConverter professorConverter;

    @Autowired
    public ProfessorService(ProfessorRepository professorRepository, ProfessorConverter professorConverter) {
        this.professorRepository = professorRepository;
        this.professorConverter = professorConverter;
    }

    public List<Professor> getAll() {
        return professorRepository.findAll();
    }

    public Professor getProfessorById(Long id) {
        return professorRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Professor", id));
    }

    public void insert(ProfessorDTO professorDTO) {
        Professor professor = professorConverter.dtoToModel(professorDTO);
        professorRepository.save(professor);
    }

    public void deleteById(Long id) {
        professorRepository.deleteById(id);
    }

    public void update(Long id, ProfessorDTO professorDTO) {
        Professor professor = professorRepository.getOne(id);
        professor.setProfessorID(professorDTO.professorID);
        professor.setFirstName(professorDTO.firstName);
        professor.setLastName(professorDTO.lastName);
        professor.setAge(professorDTO.age);
        professor.setEmail(professorDTO.email);
        professor.setPhone(professorDTO.phone);
        professor.setCourses(professorDTO.courses);
    }
}
