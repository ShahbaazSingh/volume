package com.calculate.volume.controller;

import com.calculate.volume.service.volume.Sphere;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(CalculateController.class)
public class CalculateControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private Sphere sphereVolumeCalculator;

    @Test
    public void testGetSphereVolume() throws Exception {
        when(sphereVolumeCalculator.calculateVolume(1)).thenReturn(4.1887902047863905);

        mockMvc.perform(get("/volume?radius=1"));
    }
}