package com.example.demo2.repository;

import com.example.demo2.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
