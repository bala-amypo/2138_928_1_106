package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "compliance_logs")
public class ComplianceLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean compliant;

    private LocalDateTime checkedAt;

    @ManyToOne
    @JoinColumn(name = "sensor_reading_id")
    private SensorReadingEntity sensorReading;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getCompliant() {
        return compliant;
    }

    public void setCompliant(Boolean compliant) {
        this.compliant = compliant;
    }

    public LocalDateTime getCheckedAt() {
        return checkedAt;
    }

    public void setCheckedAt(LocalDateTime checkedAt) {
        this.checkedAt = checkedAt;
    }

    public SensorReadingEntity getSensorReading() {
        return sensorReading;
    }

    public void setSensorReading(SensorReadingEntity sensorReading) {
        this.sensorReading = sensorReading;
    }
}
