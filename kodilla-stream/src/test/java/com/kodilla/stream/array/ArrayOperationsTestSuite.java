package com.kodilla.stream.array;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetListUsingFor() {
        //Given
        int[] numbers = new int[5];

        //When
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;
        numbers[3] = 8;
        numbers[4] = 8;

        //Then
        double calculatedAverageArray = ArrayOperations.getAverage(numbers);
        double expectedAverageArray = (double) (numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4])/5;
        Assert.assertEquals(expectedAverageArray, calculatedAverageArray, 0.01);
    }
}
