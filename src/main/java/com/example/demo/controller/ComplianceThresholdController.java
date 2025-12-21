package com.example.demo.controller;

import com.example.demo.entity.ComplianceThresholdEntity;
import com.example.demo.service.ComplianceThresholdService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compliance-thresholds")
public class ComplianceThresholdController {

    private final ComplianceThresholdService service;

    public ComplianceThresholdController(ComplianceThresholdService service) {
        this.service = service;
    }

    @PostMapping
    public ComplianceThresholdEntity createThreshold(
            @RequestBody ComplianceThresholdEntity threshold) {
        return service.save(threshold);
    }

    @GetMapping
    public List<ComplianceThresholdEntity> getAllThresholds() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ComplianceThresholdEntity getThresholdById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteThreshold(@PathVariable Long id) {
        service.delete(id);
        return "Compliance threshold deleted successfully";
    }
}
