package com.calculate.volume.controller;

import com.calculate.volume.service.volume.Sphere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for calculations.
 */
@RestController
public class CalculateController {

    @Autowired
    private Sphere sphereVolumeCalculator;

    @GetMapping("/volume")
    public double getSphereVolume(@RequestParam double radius) {
        return sphereVolumeCalculator.calculateVolume(radius);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleBadRequestException(){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Must be a positive radius");
    }
}