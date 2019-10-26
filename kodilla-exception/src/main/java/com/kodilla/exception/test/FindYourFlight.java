package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindYourFlight {
    private String airportName;
    private Boolean isAirportAvalible;

    public HashMap findFlight(Flight flight) {
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("Balice", true);
        flights.put("Pyrzowice", false);
        flights.put("Chopina", true)
    }
}
