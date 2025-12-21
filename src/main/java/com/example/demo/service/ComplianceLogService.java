package com.example.demo.service;

import com.example.demo.entity.ComplianceLogEntity;
import com.example.demo.repository.ComplianceLogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplianceLogService {

    private final ComplianceLogRepository repository;

    public ComplianceLogService(ComplianceLogRepository repository) {
        this.repository = repository;
    }

    public ComplianceLogEntity save(ComplianceLogEntity log) {
        return repository.save(log);
    }

    public List<ComplianceLogEntity> getAll() {
        return repository.findAll();
    }

    public ComplianceLogEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
