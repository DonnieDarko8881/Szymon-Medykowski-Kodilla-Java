package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String shapeName;
    private final static double PI = 3.14;
    private double r;
    private double field;

    public Circle(String shapeName, double r) {
        this.shapeName = shapeName;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
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
        field = PI * r * r;
        return field;
    }

    public double getR() {
        return r;
    }
}
