package com.microservices.fitnesstracker.service;

import com.microservices.fitnesstracker.model.BodyMeasurement;
import com.microservices.fitnesstracker.repository.BodyMeasurementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BodyMeasurementServiceImpl implements BodyMeasurementService {

    private BodyMeasurementRepository bodyMeasurementRepository;


    @Override
    public BodyMeasurement createBodyMeasurement(BodyMeasurement bodyMeasurement) {
        return bodyMeasurementRepository.save(bodyMeasurement);
    }

    @Override
    public List<BodyMeasurement> createBodyMeasurementList(List<BodyMeasurement> bodyMeasurements) {
        return bodyMeasurementRepository.saveAll(bodyMeasurements);
    }

    @Override
    public BodyMeasurement updateBodyMeasurement(BodyMeasurement bodyMeasurement, Long id) {
        return bodyMeasurementRepository.findById(id)
                .map(
                        b -> {
                            b.setDate(bodyMeasurement.getDate());
                            b.setWeight(bodyMeasurement.getWeight());
                            b.setBodyFarPercentage(bodyMeasurement.getBodyFarPercentage());
                            b.setChest(bodyMeasurement.getChest());
                            b.setWaist(bodyMeasurement.getWaist());
                            b.setArms(bodyMeasurement.getArms());

                            return bodyMeasurementRepository.save(b);
                        }
                ).orElse(null);
    }

    @Override
    public BodyMeasurement findById(Long id) {
        return bodyMeasurementRepository.findById(id).orElse(null);
    }

    @Override
    public List<BodyMeasurement> findAll() {
        return bodyMeasurementRepository.findAll();
    }

    @Override
    public void deleteBodyMeasurementById(Long id) {
        bodyMeasurementRepository.deleteById(id);
    }
}
