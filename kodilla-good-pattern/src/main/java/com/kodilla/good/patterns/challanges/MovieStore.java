package com.kodilla.good.patterns.challanges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieStore {
    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = listOfTranslation("Żelazny Człowiek", "Iron Man");
        List<String> avengersTranslations = listOfTranslation("Mściciele", "Avengers");
        List<String> flashTranslations = listOfTranslation("Błyskawica", "Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    private List<String> listOfTranslation(String polishTitle, String englishTitle) {
        List<String> movieTranslation = new ArrayList<>();
        movieTranslation.add(polishTitle);
        movieTranslation.add(englishTitle);
        return movieTranslation;
    }

}


