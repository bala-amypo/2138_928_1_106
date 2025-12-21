package com.example.demo.service;

import com.example.demo.entity.ComplianceThresholdEntity;
import com.example.demo.repository.ComplianceThresholdRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplianceThresholdService {

    private final ComplianceThresholdRepository repository;

    public ComplianceThresholdService(ComplianceThresholdRepository repository) {
        this.repository = repository;
    }

    public ComplianceThresholdEntity save(ComplianceThresholdEntity threshold) {
        return repository.save(threshold);
    }

    public List<ComplianceThresholdEntity> getAll() {
        return repository.findAll();
    }

    public ComplianceThresholdEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
