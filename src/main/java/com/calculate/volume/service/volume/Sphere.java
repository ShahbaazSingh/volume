package com.calculate.volume.service.volume;

import org.springframework.stereotype.Component;

/**
 * Class responsible for calculating the volume of a sphere.
 */
@Component
public class Sphere {

    /**
     * Calculates the volume of a sphere given its radius.
     * @param radius The radius of the sphere.
     * @return The volume of the sphere.
     * @throws IllegalArgumentException if the radius is negative.
     */
    public double calculateVolume(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}