package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String nameContinent;


    public Continent(String nameContinent) {
        this.nameContinent = nameContinent;

    }

    List<Country> countriesOfContinent = new ArrayList<>();

    public List<Country> addCountryToContinent(Country country){
        countriesOfContinent.add(country);
        return countriesOfContinent;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "nameContinent='" + nameContinent + '\'' +
                ", countriesOfContinent=" + countriesOfContinent +
                '}';
    }
}
