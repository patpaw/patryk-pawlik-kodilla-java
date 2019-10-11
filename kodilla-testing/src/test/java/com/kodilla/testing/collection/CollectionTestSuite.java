package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin testOddNumbersExterminatorEmptyList && testOddNumbersExterminatorNormalList");
    }

    @After
    public void after() {
        System.out.println("Test Case: end testOddNumbersExterminatorEmptyList && testOddNumbersExterminatorNormalList");
    }

    @Test
    public void testOddNumbersExterminatorNoramlList() {
        //Given
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        //When
        ArrayList<Integer> result = numbersExterminator.exterminate(numbers);

        //Then
        assertEquals(6, result.size());
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();

        //When
        ArrayList<Integer> result = numbersExterminator.exterminate(numbers);

        //Then
        assertEquals(0, result.size());

    }
}
