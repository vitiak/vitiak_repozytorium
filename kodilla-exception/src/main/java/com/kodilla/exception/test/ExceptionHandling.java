package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    SecondChalenge secondChalenge = new SecondChalenge();

    try {
        String result = secondChalenge.probablyIWillThrowException(2.4, 3.5);
        System.out.println(result);
    } catch (ArithmeticException e) {
        System.out.println("Wystąpił błąd przy porównywaniu! " + e);
    } finally {
        System.out.println("Koniec programu!");
    }

}
