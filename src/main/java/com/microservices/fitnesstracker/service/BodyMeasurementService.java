package com.microservices.fitnesstracker.service;

import com.microservices.fitnesstracker.model.BodyMeasurement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BodyMeasurementService {

    public BodyMeasurement createBodyMeasurement(BodyMeasurement bodyMeasurement);
    public List<BodyMeasurement> createBodyMeasurementList(List<BodyMeasurement> bodyMeasurements);
    public BodyMeasurement updateBodyMeasurement(BodyMeasurement bodyMeasurement, Long id);
    public BodyMeasurement findById(Long id);
    public List<BodyMeasurement> findAll();
    public void deleteBodyMeasurementById(Long id);


}
