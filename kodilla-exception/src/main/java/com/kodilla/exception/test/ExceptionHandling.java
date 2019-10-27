package com.kodilla.exception.test;

public class ExceptionHandling extends Throwable {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(1, 5);
            System.out.println(result);
        } catch ( ExceptionHandling e) {
            System.out.println( "Jeśli x >= 2 lub x < 1 lub y == 1.5");
        } finally {
            System.out.println("Jakoś poszło.");
        }
    }
}
