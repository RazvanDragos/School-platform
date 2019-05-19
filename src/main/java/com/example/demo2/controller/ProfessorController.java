package com.example.demo2.controller;

import com.example.demo2.dto.ProfessorDTO;
import com.example.demo2.model.Professor;
import com.example.demo2.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/professors", produces = "application/json")
public class ProfessorController {
    private final ProfessorService professorService;

    @Autowired
    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Professor> getAllProfessors() {
        return professorService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Professor> getProfessorById(@PathVariable(value = "id") Long professorID) {
        return new ResponseEntity<>(professorService.getProfessorById(professorID), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void insert(@RequestBody ProfessorDTO professorDTO) {
        professorService.insert(professorDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable(value = "id") Long id) {
        professorService.deleteById(id);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable(value = "id") Long professorID, ProfessorDTO professorDTO) {
        professorService.update(professorID, professorDTO);
    }
}
