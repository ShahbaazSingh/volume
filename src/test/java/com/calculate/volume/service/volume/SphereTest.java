package com.calculate.volume.service.volume;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SphereTest {

    private final Sphere sphereVolumeCalculator = new Sphere();

    @Test
    public void testCalculateVolume() {
        assertEquals(4.1887902047863905, sphereVolumeCalculator.calculateVolume(1), 0.0001);
        assertEquals(33.510321638291124, sphereVolumeCalculator.calculateVolume(2), 0.0001);
    }

    @Test
    public void testCalculateVolumeWithNegativeRadius() {
        assertThrows(IllegalArgumentException.class, () -> sphereVolumeCalculator.calculateVolume(-1));
    }
}