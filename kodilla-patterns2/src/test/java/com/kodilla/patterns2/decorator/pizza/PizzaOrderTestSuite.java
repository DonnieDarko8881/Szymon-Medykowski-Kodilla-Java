package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    public final static String PIZZA_DOUGHT = "Pizza Dought";
    public final static String TOMATO_SAUCE_WITH_CHEESE = "Tomato Sauce with Cheese";
    private static final String SALAMI_PEPPERONI = "Salami Pepperoni" ;
    private static final String EXTRA_CHEESE = "Extra Cheese";

    @Test
    public void shouldReturn15AsGetCostBasicPizza() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder(PIZZA_DOUGHT, TOMATO_SAUCE_WITH_CHEESE);
        //When
        BigDecimal calculatedCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(15),calculatedCost);
    }

    @Test
    public void testTaxiNetworkGetDescription(){
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder(PIZZA_DOUGHT,TOMATO_SAUCE_WITH_CHEESE);
        //when
        String description = thePizza.getDescription();
        //Then
        assertEquals("Pizza with "+ PIZZA_DOUGHT + " ," + TOMATO_SAUCE_WITH_CHEESE, description);
    }


    @Test
    public void shouldReturn18AsGetCostPeperoniPizza() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder(PIZZA_DOUGHT, TOMATO_SAUCE_WITH_CHEESE);
        thePizza = new PeperoniPizzaOrderDecorator(thePizza,SALAMI_PEPPERONI);
        //When
        BigDecimal calculatedCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(18),calculatedCost);
    }

    @Test
    public void testPeperoniPizzaGetDescription(){
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder(PIZZA_DOUGHT,TOMATO_SAUCE_WITH_CHEESE);
        thePizza = new PeperoniPizzaOrderDecorator(thePizza,SALAMI_PEPPERONI);
        //when
        String description = thePizza.getDescription();
        //Then
        assertEquals("Pizza with "+ PIZZA_DOUGHT + " ," + TOMATO_SAUCE_WITH_CHEESE + " ,"+ SALAMI_PEPPERONI, description);
    }

    @Test
    public void shouldReturn20AsGetCostPeperoniPizzaWithExtraCheese() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder(PIZZA_DOUGHT, TOMATO_SAUCE_WITH_CHEESE);
        thePizza = new PeperoniPizzaOrderDecorator(thePizza,SALAMI_PEPPERONI);
        thePizza = new ExtraCheeseDecorator(thePizza,EXTRA_CHEESE);
        //When
        BigDecimal calculatedCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(20),calculatedCost);
    }

    @Test
    public void testPeperoniPizzaWithExtraCheeseGetDescription(){
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder(PIZZA_DOUGHT,TOMATO_SAUCE_WITH_CHEESE);
        thePizza = new PeperoniPizzaOrderDecorator(thePizza,SALAMI_PEPPERONI);
        thePizza = new ExtraCheeseDecorator(thePizza, EXTRA_CHEESE);
        //when
        String description = thePizza.getDescription();
        //Then
        assertEquals("Pizza with "+ PIZZA_DOUGHT + " ," + TOMATO_SAUCE_WITH_CHEESE + " ,"
                + SALAMI_PEPPERONI +" ,"+ EXTRA_CHEESE, description);
    }

}
