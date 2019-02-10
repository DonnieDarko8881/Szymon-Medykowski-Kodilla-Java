package com.kodilla.good.patterns.challanges.allegro.subject;

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
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", numberOfProduct=" + numberOfProduct +
                ", price=" + price +
                '}';
    }
}
