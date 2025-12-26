package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;

public class SensorReadingServiceImpl {
    private final SensorReadingRepository repo;
    private final SensorRepository sensorRepo;

    public SensorReadingServiceImpl(SensorReadingRepository r, SensorRepository s) {
        this.repo = r;
        this.sensorRepo = s;
    }

    public SensorReading submitReading(Long sensorId, SensorReading r) {
        if (r.getReadingValue() == null)
            throw new IllegalArgumentException("readingValue required");

        Sensor s = sensorRepo.findById(sensorId)
                .orElseThrow(() -> new RuntimeException("not found"));

        r.setSensor(s);
        r.setStatus("PENDING");
        return repo.save(r);
    }

    public SensorReading getReading(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
    }
}
