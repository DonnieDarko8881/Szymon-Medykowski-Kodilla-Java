package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    List<Continent> continentsOfWord = new ArrayList<>();


    public List<Continent> addContinentToWord(Continent continent){
        continentsOfWord.add(continent);
        return continentsOfWord;
    }

    public BigDecimal getTotalPeopleWordQuantity(){

        return continentsOfWord.stream()
                .flatMap(cos -> cos.countriesOfContinent.stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    public void show(){
        continentsOfWord.stream()
                .forEach(System.out::println);
    }
}
