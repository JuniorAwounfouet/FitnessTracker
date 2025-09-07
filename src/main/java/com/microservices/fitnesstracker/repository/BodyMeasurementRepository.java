package com.microservices.fitnesstracker.repository;

import com.microservices.fitnesstracker.model.BodyMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodyMeasurementRepository extends JpaRepository<BodyMeasurement,Long> {
}
