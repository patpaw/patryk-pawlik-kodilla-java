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

        Calculator calculator = new Calculator(15,10);

        int resultAdd = calculator.addAToB();
        int resultSubtract = calculator.subtractBFromA();

        if (resultAdd == 25) {
            System.out.println("Test ok");
        } else {
            System.out.println("Error!");
        }

        if (resultSubtract == 5) {
            System.out.println("Test ok");
        } else {
            System.out.println("Error!");

        }
    }
}