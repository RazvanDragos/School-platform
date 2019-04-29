package com.example.demo2.service;

import com.example.demo2.exception.NotFoundException;
import com.example.demo2.model.Company;
import com.example.demo2.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    public Company getCompanyById(Long id) {
        return companyRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Company", id));
    }
}
