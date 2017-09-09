package com.kodilla.spring.calculator;

import com.kodilla.spring.library.Library;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalcAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.add(2.0, 4.0);
        //Then
        Assert.assertEquals(2.0+4.0, result, 0.1);
    }

    @Test
    public void testCalcSub() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.sub(2.0, 4.0);
        //Then
        Assert.assertEquals(2.0 - 4.0, result, 0.1);
    }

    @Test
    public void testCalcMult() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.mul(2.0, 4.0);
        //Then
        Assert.assertEquals(2.0 * 4.0, result, 0.1);
    }

    @Test
    public void testCalcDiv() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.div(2.0, 4.0);
        //Then
        Assert.assertEquals(2.0 / 4.0, result, 0.1);
    }

}
