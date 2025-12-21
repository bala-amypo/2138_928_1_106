package com.example.demo.repository;

import com.example.demo.entity.SensorReadingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorReadingRepository
        extends JpaRepository<SensorReadingEntity, Long> {
}
