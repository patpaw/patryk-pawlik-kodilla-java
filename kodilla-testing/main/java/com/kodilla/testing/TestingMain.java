package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int resultAdd = calculator.addAToB(15,10);
        int resultSubtract = calculator.subtractBFromA(15,10);

        if (resultAdd.equals(25)) {
            System.out.println("Test ok");
        } else {
            System.out.println("Erro!");
        }

        if (resultSubtract.equals(5)) {
            System.out.println("Test ok");
        } else {
            System.out.println("Erro!");

        }
    }
}