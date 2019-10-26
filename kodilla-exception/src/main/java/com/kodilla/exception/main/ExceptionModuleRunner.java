package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderEXception;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;

import java.io.File;

public class ExceptionModuleRunner {
    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (FileReaderEXception e) {
            System.out.println("Problem while reading a file");
        }

        System.out.println("--------------------------------------------------");

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(1, 5);
            System.out.println(result);
        } catch (ExceptionHandling e) {
            System.out.println( "Jeśli x >= 2 lub x < 1 lub y == 1.5");
        } finally {
            System.out.println("Jakoś poszło.");
        }
    }
}
