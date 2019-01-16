package com.kodilla.good.patterns.challanges.FOOD2Order.food;

public class Food {
    private final String name;
    private final TypeOfFood typeOfFood;
    private final String descriptionOfFood;
    private final double price;

    public Food(String name, TypeOfFood typeOfFood, String descriptionOfFood, double price) {
        this.name = name;
        this.typeOfFood = typeOfFood;
        this.descriptionOfFood = descriptionOfFood;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public TypeOfFood getTypeOfFood() {
        return typeOfFood;
    }

    public double getPrice() {
        return price;
    }

    public String getDescriptionOfFood() {
        return descriptionOfFood;
    }
}
