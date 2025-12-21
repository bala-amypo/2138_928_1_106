package com.example.demo.service;

import com.example.demo.entity.SensorEntity;
import com.example.demo.repository.SensorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    private final SensorRepository repository;

    public SensorService(SensorRepository repository) {
        this.repository = repository;
    }

    public SensorEntity save(SensorEntity sensor) {
        return repository.save(sensor);
    }

    public List<SensorEntity> getAll() {
        return repository.findAll();
    }

    public SensorEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

