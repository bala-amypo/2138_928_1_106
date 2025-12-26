package com.example.demo.controller;

import com.example.demo.entity.Sensor;
import com.example.demo.entity.Location;
import com.example.demo.service.SensorService;
import com.example.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController {

    @Autowired
    private SensorService sensorService;

    @Autowired
    private LocationService locationService;

    @GetMapping("/locations")
    public List<Location> getAllLocations() {
        return locationService.getAllLocations();
    }

    @PostMapping("/locations")
    public Location createLocation(@RequestBody Location loc) {
        return locationService.createLocation(loc);
    }

    @GetMapping("/sensors")
    public List<Sensor> getAllSensors() {
        return sensorService.getAllSensors();
    }

    @PostMapping("/locations/{locId}/sensors")
    public Sensor createSensor(@PathVariable Long locId, @RequestBody Sensor sensor) {
        return sensorService.createSensor(locId, sensor);
    }
}
