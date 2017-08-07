package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int resultAdd = calculator.addAToB(2,3);
        if (resultAdd == 2+3) {
            System.out.println("test addAToB OK");
        } else {
            System.out.println("Error!");
        }

        int resultSubstract = calculator.substractAFromB(2,3);
        if (resultSubstract == 3-2) {
            System.out.println("test substractAFromB OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("TO O TO CHODZILO???");
    }
}
