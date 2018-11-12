package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName;
    private double a;
    private double field;


    public Square(String shapeName, double a) {
        this.shapeName = shapeName;
        this.a = a;

    }

    @Override
    public String toString() {
        return "Square{" +
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
        field = a*a;
        return field;
    }



    public double getA() {
        return a;
    }

}
