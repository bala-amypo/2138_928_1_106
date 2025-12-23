package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sensor_readings")
public class SensorReadingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double value;

    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "sensor_id")
    private SensorEntity sensor;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public SensorEntity getSensor() {
        return sensor;
    }

    public void setSensor(SensorEntity sensor) {
        this.sensor = sensor;
    }
}
