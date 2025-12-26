package com.example.demo.repository;

import com.example.demo.entity.SensorReading;
import java.util.List;
import java.util.Optional;

public interface SensorReadingRepository {

    Optional<SensorReading> findById(Long id);

    SensorReading save(SensorReading reading);

    List<SensorReading> findBySensor_Id(Long sensorId);

    List<SensorReading> findBySensor_IdAndReadingTimeBetween(
            Long sensorId,
            Object start,
            Object end
    );
}
