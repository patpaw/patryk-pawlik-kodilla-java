package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {


    List<Continent> continentList = new ArrayList<>();
    continentList.add(new Continent("Europe"));
    continentList.add(new Continent("Asia"));
    continentList.add(new Continent("Africa"));

    public BigDecimal getPeopleQuantity(BigDecimal x) {
        return x;

    }
}
