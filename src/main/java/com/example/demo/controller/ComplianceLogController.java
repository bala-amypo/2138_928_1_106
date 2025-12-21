package com.example.demo.controller;

import com.example.demo.entity.ComplianceLogEntity;
import com.example.demo.service.ComplianceLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compliance-logs")
public class ComplianceLogController {

    private final ComplianceLogService service;

    public ComplianceLogController(ComplianceLogService service) {
        this.service = service;
    }

    @PostMapping
    public ComplianceLogEntity createLog(@RequestBody ComplianceLogEntity log) {
        return service.save(log);
    }

    @GetMapping
    public List<ComplianceLogEntity> getAllLogs() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ComplianceLogEntity getLogById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteLog(@PathVariable Long id) {
        service.delete(id);
        return "Compliance log deleted successfully";
    }
}
