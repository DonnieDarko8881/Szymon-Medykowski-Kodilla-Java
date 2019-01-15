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
    public void return5TestAdd() {
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
    public void return5TestSub() {
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
    public void return10TestMul() {
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
    public void return5TestDiv() {
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
