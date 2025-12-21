package com.example.demo.controller;

import com.example.demo.entity.SensorReadingEntity;
import com.example.demo.service.SensorReadingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensor-readings")
public class SensorReadingController {

    private final SensorReadingService service;

    public SensorReadingController(SensorReadingService service) {
        this.service = service;
    }

    @PostMapping
    public SensorReadingEntity createReading(@RequestBody SensorReadingEntity reading) {
        return service.save(reading);
    }

    @GetMapping
    public List<SensorReadingEntity> getAllReadings() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public SensorReadingEntity getReadingById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteReading(@PathVariable Long id) {
        service.delete(id);
        return "Sensor reading deleted successfully";
    }
}
