package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    String name;
    BigDecimal quantityPeople;

    public Country(String name, BigDecimal quantityPeople) {
        this.name = name;
        this.quantityPeople = quantityPeople;
    }

    public  BigDecimal getPeopleQuantity() {
        return quantityPeople;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", quantityPeople=" + quantityPeople +
                '}';
    }
}
