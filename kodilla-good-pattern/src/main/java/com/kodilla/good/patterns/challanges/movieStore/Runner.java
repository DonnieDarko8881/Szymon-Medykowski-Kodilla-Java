package com.kodilla.good.patterns.challanges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.kodilla.good.patterns.challanges.MovieStoreService.show;

public class Runner {
    public static void main(String[] args) {
        MovieStoreService movieStoreService= new MovieStoreService();
        show(movieStoreService.joiningTitleOfBookWithTranslationWithDelimiter("!"));

    }


}
