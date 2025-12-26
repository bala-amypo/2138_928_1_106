package com.example.demo.repository;

import com.example.demo.entity.Sensor;
import java.util.List;
import java.util.Optional;

public interface SensorRepository {

    Optional<Sensor> findById(Long id);

    Sensor save(Sensor sensor);

    List<Sensor> findAll();

    Optional<Sensor> findBySensorCode(String sensorCode);

    List<Sensor> findByLocation_Region(String region);
}
