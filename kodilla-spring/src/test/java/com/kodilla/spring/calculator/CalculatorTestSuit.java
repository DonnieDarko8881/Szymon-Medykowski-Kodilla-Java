package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuit {

    @Test
    public void shouldReturn5FromAddition() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.add(2.0, 3.0);
        //Then
        Assert.assertEquals(5.0, val, 0.0);
        System.out.println(val);
    }

    @Test
    public void shouldReturn5FromSubstitution() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.sub(7.0, 2.0);
        //Then
        Assert.assertEquals(5.0, val, 0.0);
        System.out.println(val);
    }

    @Test
    public void shouldReturn10FromMultiplication() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.mul(5.0, 2.0);
        //Then
        Assert.assertEquals(10.0, val, 0.0);
        System.out.println(val);
    }

    @Test
    public void shouldReturn5FromDividing() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.div(10.0, 2.0);
        //Then
        Assert.assertEquals(5.0, val, 0.0);
        System.out.println(val);
    }
}
