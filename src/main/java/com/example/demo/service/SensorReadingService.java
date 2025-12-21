package com.example.demo.service;

import com.example.demo.entity.SensorReadingEntity;
import com.example.demo.repository.SensorReadingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorReadingService {

    private final SensorReadingRepository repository;

    public SensorReadingService(SensorReadingRepository repository) {
        this.repository = repository;
    }

    public SensorReadingEntity save(SensorReadingEntity reading) {
        return repository.save(reading);
    }

    public List<SensorReadingEntity> getAll() {
        return repository.findAll();
    }

    public SensorReadingEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
