package com.example.demo.service.impl;

import com.example.demo.entity.ComplianceThreshold;
import com.example.demo.repository.ComplianceThresholdRepository;

public class ComplianceThresholdServiceImpl {
    private final ComplianceThresholdRepository repo;

    public ComplianceThresholdServiceImpl(ComplianceThresholdRepository repo) {
        this.repo = repo;
    }

    public ComplianceThreshold createThreshold(ComplianceThreshold t) {
        if (t.getMinValue() >= t.getMaxValue())
            throw new IllegalArgumentException("minValue must be < maxValue");
        return repo.save(t);
    }

    public ComplianceThreshold getThresholdBySensorType(String type) {
        return repo.findBySensorType(type)
                .orElseThrow(() -> new RuntimeException("not found"));
    }
}
