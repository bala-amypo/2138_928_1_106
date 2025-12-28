package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;

public class SensorServiceImpl {
    private final SensorRepository sensorRepo;
    private final LocationRepository locationRepo;

    public SensorServiceImpl(SensorRepository s, LocationRepository l) {
        this.sensorRepo = s;
        this.locationRepo = l;
    }

    public Sensor createSensor(Long locationId, Sensor s) {
        if (s.getSensorType() == null)
            throw new IllegalArgumentException("sensorType required");

        Location loc = locationRepo.findById(locationId)
                .orElseThrow(() -> new RuntimeException("not found"));

        s.setLocation(loc);
        return sensorRepo.save(s);
    }

    public Sensor getSensor(Long id) {
        return sensorRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
    }

    public java.util.List<Sensor> getAllSensors() {
        return sensorRepo.findAll();
    }
}
