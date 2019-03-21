package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheeseDecorator extends AbstractPizzaOrderDecorator {
    private final String extraCheese;

    public ExtraCheeseDecorator(PizzaOrder pizzaOrder, String extraCheese) {
        super(pizzaOrder);
        this.extraCheese = extraCheese;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " ,"+ "Extra Cheese";
    }
}
