package com.example.demo.service;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    private final LocationRepository repository;

    public LocationService(LocationRepository repository) {
        this.repository = repository;
    }

    public LocationEntity save(LocationEntity location) {
        return repository.save(location);
    }

    public List<LocationEntity> getAll() {
        return repository.findAll();
    }

    public LocationEntity getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
