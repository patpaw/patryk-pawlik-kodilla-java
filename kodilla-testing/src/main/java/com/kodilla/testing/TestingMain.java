package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator(10,6);

        double a = calculator.getA();
        double b = calculator.getB();

        System.out.println("Testowanie");

        if (calculator.addAToB() == 16) {
            System.out.println("Test dodawania przebiegł pomyślnie.");
        } else {
            System.out.println("Test error! ");
        }

        if (calculator.subtractBFromA() == 4) {
            System.out.println("Test odejmowania przebiegł pomyślnie.");
        } else {
            System.out.println("Test error! ");
        }

    }
}