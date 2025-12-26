package com.example.demo.repository;

import com.example.demo.entity.ComplianceLog;
import java.util.List;

public interface ComplianceLogRepository {

    ComplianceLog save(ComplianceLog log);

    List<ComplianceLog> findBySensorReading_Id(Long readingId);
}
