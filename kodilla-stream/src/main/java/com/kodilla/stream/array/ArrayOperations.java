package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ArrayOperations {

    public static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n->numbers[n])
                .forEach(System.out::println);

        double averageNumbers = IntStream.range(0,numbers.length)
                .map(n->numbers[n])
               .average()
               .getAsDouble();

            System.out.println("Average is equal " + averageNumbers );

        return averageNumbers;
    }
}
