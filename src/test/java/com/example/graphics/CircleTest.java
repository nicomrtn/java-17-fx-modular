package com.example.graphics;


import com.example.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {
    private Circle c = null;

    @BeforeEach
    public void before () {
        this.c = new Circle();
    }

    @Test
    public void testComputeCircumference() {
        assertEquals (c.computeCircumference(2), 2*Math.PI*2, 0.01);
    }

    @Test
    public void testComputeArea() {
        assertEquals (c.computeArea(2), Math.PI*2*2, 0.01);
    }
}
