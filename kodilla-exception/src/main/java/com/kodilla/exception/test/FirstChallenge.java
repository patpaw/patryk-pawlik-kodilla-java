package com.kodilla.exception.test;

import java.io.IOException;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        try {
            FirstChallenge firstChallenge = new FirstChallenge();
            double result = firstChallenge.divide(3, 1);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Nie dzielimy przez 0 ");
        } finally {
            System.out.println("Pamiętaj nie dzielimy przez 0");
        }
    }
}