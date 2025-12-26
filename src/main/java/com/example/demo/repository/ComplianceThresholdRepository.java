package com.example.demo.repository;

import com.example.demo.entity.ComplianceThreshold;
import java.util.Optional;

public interface ComplianceThresholdRepository {

    ComplianceThreshold save(ComplianceThreshold threshold);

    Optional<ComplianceThreshold> findBySensorType(String sensorType);
}
