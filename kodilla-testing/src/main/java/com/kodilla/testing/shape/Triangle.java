package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName;
    private double a;
    private double h;
    private double field;

    public Triangle(String shapeName, double a, double h) {
        this.shapeName = shapeName;
        this.a = a;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + getField() +
                '}';
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        field = 0.5*a*h;
        return field;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }
}
