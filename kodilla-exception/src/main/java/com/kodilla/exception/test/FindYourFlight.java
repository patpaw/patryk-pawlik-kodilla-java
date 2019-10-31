package com.kodilla.exception.test;

import java.util.HashMap;

public class FindYourFlight {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Balice", true);
        flights.put("Pyrzowice", false);
        flights.put("Chopina", true);

        if(flights.containsKey(flight.getArrivalAirport())) {
            return flights.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }
}
