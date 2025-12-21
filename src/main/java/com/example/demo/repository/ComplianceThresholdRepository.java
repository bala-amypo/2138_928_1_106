package com.example.demo.repository;

import com.example.demo.entity.ComplianceThresholdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplianceThresholdRepository
        extends JpaRepository<ComplianceThresholdEntity, Long> {
}
