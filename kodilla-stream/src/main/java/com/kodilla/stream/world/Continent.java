package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;

    private final List<Country> countries = new ArrayList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public final String getContinentName() {
        return continentName;
    }

    public final List<Country> getCountries() {
        return countries;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }
}
