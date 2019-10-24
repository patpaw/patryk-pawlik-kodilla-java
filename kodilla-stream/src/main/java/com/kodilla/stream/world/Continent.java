package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String country;

    public Continent(String country) {
        this.country = country;
    }

    List<Country> europeList = new ArrayList<>();
    List<Country> asiaList = new ArrayList<>();
    List<Country> africaList = new ArrayList<>();
    europeList.add(new Continent("Polska"));
    europeList.add(new Continent("Niemcy"));
    europeList.add("Czechy");
    europeList.add("Słowacja");

    asiaList.add("Chiny");
    asiaList.add("Indie");
    asiaList.add("Tajlandia");
    asiaList.add("Korea Północna");

    africaList.add("Algieria");
    africaList.add("Benin");
    africaList.add("Botswana");
    africaList.add("Angola");




}
