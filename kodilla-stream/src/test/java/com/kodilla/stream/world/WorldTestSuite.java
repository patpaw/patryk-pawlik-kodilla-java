package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent Europe = new Continent("Europe");
        Europe.addCountry(new Country("Polska", new BigDecimal("84565456468")));
        Europe.addCountry(new Country("Niemcy", new BigDecimal("876518936545")));
        Europe.addCountry(new Country("Czechy", new BigDecimal("23131465465")));
        Europe.addCountry(new Country("Słowacja", new BigDecimal("878979845631")));

        Continent Asia = new Continent("Asia");
        Asia.addCountry(new Country("Chiny", new BigDecimal("35154654665465")));
        Asia.addCountry(new Country("Indie", new BigDecimal("3213121385558")));
        Asia.addCountry(new Country("Tajlandia", new BigDecimal("888888526564")));
        Asia.addCountry(new Country("Korea Północna", new BigDecimal("87987988795325")));

        Continent Africa = new Continent("Africa");
        Africa.addCountry(new Country("Algieria", new BigDecimal("55545551515")));
        Africa.addCountry(new Country("Benin",new BigDecimal( "22232324")));
        Africa.addCountry(new Country("Botswana", new BigDecimal("335521554")));
        Africa.addCountry(new Country("Angola", new BigDecimal("1555225662")));

        World world = new World();
        world.addContinent(Europe);
        world.addContinent(Asia);
        world.addContinent(Africa);

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
         BigDecimal expectedPeopleQuantity = new BigDecimal("129165307608076");
        Assert.assertEquals(expectedPeopleQuantity, peopleQuantity);
    }
}
