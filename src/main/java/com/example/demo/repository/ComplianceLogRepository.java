package com.example.demo.repository;

import com.example.demo.entity.ComplianceLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplianceLogRepository
        extends JpaRepository<ComplianceLogEntity, Long> {
}
