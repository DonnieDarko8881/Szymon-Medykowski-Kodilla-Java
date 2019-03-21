package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PeperoniPizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    private final String salamiPepperoni;

    public PeperoniPizzaOrderDecorator(PizzaOrder pizzaOrder, String salamiPepperoni) {
        super(pizzaOrder);
        this.salamiPepperoni = salamiPepperoni;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " ,"+ salamiPepperoni;
    }

}
