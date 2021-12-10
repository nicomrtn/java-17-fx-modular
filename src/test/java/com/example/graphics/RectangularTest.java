package com.example.graphics;


import com.example.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangularTest {
    private Rectangular c = null;

    @BeforeEach
    public void before () {
        this.c = new Rectangular();
    }

    @Test
    public void testComputeCircumference() {
        assertEquals (c.computeCircumference(), 0.0, 0.01);
    }

    @Test
    public void testComputeArea() {
        assertEquals (c.computeArea(), 0.0, 0.01);
    }
}
