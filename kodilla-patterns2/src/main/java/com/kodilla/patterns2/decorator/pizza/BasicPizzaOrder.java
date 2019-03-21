package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    private final String pizzaDough;
    private final String tomatoSauceWithCheese;

    public BasicPizzaOrder(String pizzaDough, String tomatoSauceWithCheese) {
        this.pizzaDough = pizzaDough;
        this.tomatoSauceWithCheese = tomatoSauceWithCheese;
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "Pizza with "+ pizzaDough + " ," + tomatoSauceWithCheese;
    }
}
