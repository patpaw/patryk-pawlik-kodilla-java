package com.kodilla.exception.test;

public class ApplicationFlight {

    public static void main(String[] args) {
        Flight flight = new Flight("Balice", "Chopina");

        FindYourFlight findYourFlight = new FindYourFlight();
        try {
            System.out.println(findYourFlight.findFlight(flight));
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }
    }
}
