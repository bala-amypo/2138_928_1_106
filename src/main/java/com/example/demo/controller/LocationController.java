package com.example.demo.controller;

import com.example.demo.entity.LocationEntity;
import com.example.demo.service.LocationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    private final LocationService service;

    public LocationController(LocationService service) {
        this.service = service;
    }

    @PostMapping
    public LocationEntity createLocation(@RequestBody LocationEntity location) {
        return service.save(location);
    }

    @GetMapping
    public List<LocationEntity> getAllLocations() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public LocationEntity getLocationById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteLocation(@PathVariable Long id) {
        service.delete(id);
        return "Location deleted successfully";
    }
}
