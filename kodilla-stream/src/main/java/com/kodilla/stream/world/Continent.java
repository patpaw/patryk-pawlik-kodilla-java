package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continent;

    public Continent(String continent) {
        this.continent = continent;
    }

    List<Country> europeList = new ArrayList<>();
    List<Country> asiaList = new ArrayList<>();
    List<Country> africaList = new ArrayList<>();
    europeList.add(new Country("Polska"));
    europeList.add(new Country("Niemcy"));
    europeList.add(new Country("Czechy"));
    europeList.add(new Country("Słowacja"));

    asiaList.add(new Country("Chiny"));
    asiaList.add(new Country("Indie"));
    asiaList.add(new Country("Tajlandia"));
    asiaList.add(new Country("Korea Północna"));

    africaList.add(new Country("Algieria"));
    africaList.add(new Country("Benin"));
    africaList.add(new Country("Botswana"));
    africaList.add(new Country("Angola"));




}
