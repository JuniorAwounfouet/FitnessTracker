package com.microservices.fitnesstracker.controller;

import com.microservices.fitnesstracker.model.BodyMeasurement;
import com.microservices.fitnesstracker.service.BodyMeasure.BodyMeasurementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mesure")
@AllArgsConstructor
public class BodyMeasurementController {

    BodyMeasurementService bodyMeasurementService;

    @PostMapping("/create")
    public BodyMeasurement create(@RequestBody BodyMeasurement bodyMeasurement) {
        return bodyMeasurementService.createBodyMeasurement(bodyMeasurement);
    }

    @PostMapping("/createMesures")
    public List<BodyMeasurement> createMesures(@RequestBody List<BodyMeasurement> bodyMeasurements) {
        return bodyMeasurementService.createBodyMeasurementList(bodyMeasurements);
    }

    @GetMapping("/{id}")
    public BodyMeasurement findById(@PathVariable Long id) {
        return bodyMeasurementService.findById(id);
    }

    @GetMapping("/mesures")
    public List<BodyMeasurement> findAll() {
        return bodyMeasurementService.findAll();
    }

    @PutMapping("/update/{id}")
    public BodyMeasurement update(@RequestBody BodyMeasurement bodyMeasurement,@PathVariable Long id) {
        return bodyMeasurementService.updateBodyMeasurement(bodyMeasurement, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        bodyMeasurementService.deleteBodyMeasurementById(id);
    }

}
