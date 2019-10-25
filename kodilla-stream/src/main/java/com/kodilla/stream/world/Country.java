package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public final String getCountryName() {
        return countryName;
    }

    public final BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
