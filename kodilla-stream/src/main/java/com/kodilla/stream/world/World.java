package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final String continent;

    public World(String continent) {
        this.continent = continent;
    }

    List<Continent> continentList = new ArrayList<>();
    continentList.add(new World("Europe"));
    continentList.add(new World("Asia"));
    continentList.add(new World("Africa"));

    public BigDecimal getPeopleQuantity(BigDecimal x) {
        return x;

    }
}
