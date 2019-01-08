package com.kodilla.good.patterns.challanges.allegro.subject;


import java.util.Objects;

final public class Subject {
    private final String name;
    private final int numberOfProduct;
    private final double price;

    public Subject(String name, int numberOfProduct, double price) {
        this.name = name;
        this.numberOfProduct = numberOfProduct;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfProduct() {
        return numberOfProduct;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return numberOfProduct == subject.numberOfProduct;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfProduct);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", numberOfProduct=" + numberOfProduct +
                ", price=" + price +
                '}';
    }
}
