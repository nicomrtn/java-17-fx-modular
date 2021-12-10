package com.example.graphics;

public class Circle extends Shape{

    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI*getRadius()*getRadius();
    }

    public double computeCircumference(double radius) {
        return 2*Math.PI*getRadius();
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
