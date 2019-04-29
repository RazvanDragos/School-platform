package com.example.demo2.controller;

import com.example.demo2.model.Company;
import com.example.demo2.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/company", produces = "application/json")
public class CompanyController {
    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public ResponseEntity<List<Company>> getAllNotes() {
        return new ResponseEntity<>(companyService.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Company> getCompanyById(@PathVariable("id") Long companyId) {
        return new ResponseEntity<>(companyService.getCompanyById(companyId), HttpStatus.OK);
    }

}
