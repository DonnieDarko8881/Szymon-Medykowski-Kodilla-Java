package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbersExterminator {

    static List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        evenNumbers.stream()
                .forEach(System.out::println);

        return evenNumbers;
    }
}

