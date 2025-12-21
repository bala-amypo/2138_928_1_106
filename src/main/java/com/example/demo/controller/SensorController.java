package com.example.demo.controller;

import com.example.demo.entity.SensorEntity;
import com.example.demo.service.SensorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    private final SensorService service;

    public SensorController(SensorService service) {
        this.service = service;
    }

    @PostMapping
    public SensorEntity createSensor(@RequestBody SensorEntity sensor) {
        return service.save(sensor);
    }

    @GetMapping
    public List<SensorEntity> getAllSensors() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public SensorEntity getSensorById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteSensor(@PathVariable Long id) {
        service.delete(id);
        return "Sensor deleted successfully";
    }
}
