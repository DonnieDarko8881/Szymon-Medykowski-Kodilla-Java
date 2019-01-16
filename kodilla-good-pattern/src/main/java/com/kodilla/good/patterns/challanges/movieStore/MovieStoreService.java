package com.kodilla.good.patterns.challanges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreService {
    MovieStore movieStore = new MovieStore();
    Map<String, List<String>> mapOfMovies = movieStore.getMovies();

    protected static void show(String movies) {
        System.out.println(movies);
    }

    protected  String joiningTitleOfBookWithTranslationWithDelimiter(final String DELIMITER) {
        return mapOfMovies.entrySet().stream()
                .flatMap(cos -> cos.getValue().stream())
                .collect(Collectors.joining(DELIMITER));
    }
}
