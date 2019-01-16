package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Display display;

    public Calculator(final Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double val = a + b;
        return display.displayValue(val);
    }

    public double sub(double a, double b) {
        double val = a - b;
        return display.displayValue(val);
    }

    public double mul(double a, double b) {
        double val = a * b;
        return display.displayValue(val);
    }

    public double div(double a, double b) {
        double val = a / b;
        return display.displayValue(val);
    }
}
