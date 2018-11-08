package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        calculator.add(5, 10);
        Integer total = calculator.add(5, 10);
        Integer difference = calculator.subtract(5, 10);

        if (total.equals(15)) {
            System.out.println("test calculator.add(int a,int b) OK");
        } else {
            System.out.println("calculator.add(int a,int b) Error!");
        }

        if (difference.equals(-5)) {
            System.out.println("test calculator.subtract(5,10) OK");
        } else {
            System.out.println("calculator.subtract(5,10) Error!");
        }
    }
}