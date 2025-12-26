package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;

import java.util.List;

public class ComplianceEvaluationServiceImpl {
    private final SensorReadingRepository readingRepo;
    private final ComplianceThresholdRepository thresholdRepo;
    private final ComplianceLogRepository logRepo;

    public ComplianceEvaluationServiceImpl(
            SensorReadingRepository r,
            ComplianceThresholdRepository t,
            ComplianceLogRepository l) {
        this.readingRepo = r;
        this.thresholdRepo = t;
        this.logRepo = l;
    }

    public ComplianceLog evaluateReading(Long readingId) {
        SensorReading r = readingRepo.findById(readingId)
                .orElseThrow(() -> new RuntimeException("not found"));

        List<ComplianceLog> existing = logRepo.findBySensorReading_Id(readingId);
        if (!existing.isEmpty())
            return existing.get(0);

        ComplianceThreshold t = thresholdRepo
                .findBySensorType(r.getSensor().getSensorType())
                .orElseThrow(() -> new RuntimeException("not found"));

        ComplianceLog log = new ComplianceLog();
        log.setSensorReading(r);

        if (r.getReadingValue() < t.getMinValue() ||
            r.getReadingValue() > t.getMaxValue())
            log.setStatusAssigned("UNSAFE");
        else
            log.setStatusAssigned("SAFE");

        return logRepo.save(log);
    }
}
