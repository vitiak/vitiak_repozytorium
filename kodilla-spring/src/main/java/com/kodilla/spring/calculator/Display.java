package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public void displayValue(double Val) {
        System.out.println("Value" + Val);
    }
}
