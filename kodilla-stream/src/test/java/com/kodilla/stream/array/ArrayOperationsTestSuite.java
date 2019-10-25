package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] array = new int[10];
        array[0] = 4;
        array[1] = 2;
        array[2] = 2;
        array[3] = 8;
        array[4] = 6;
        array[5] = 2;
        array[6] = 5;
        array[7] = 1;
        array[8] = 3;
        array[9] = 9;

        //When
        double average1 = ArrayOperations.getAverage(array);
        System.out.println("\n" + "średnia: " + average1);

        //Then
        Assert.assertEquals(4.2, average1, 0.01);
    }
}