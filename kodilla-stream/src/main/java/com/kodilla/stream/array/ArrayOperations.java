package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

public interface ArrayOperations {

     static double getAverage(int[] numbers){
         IntStream.range(0,numbers.length)
                 .map(n -> numbers[n])
                 .forEach(System.out::println);

         OptionalDouble average = IntStream.range(0,numbers.length)
                 .map(n -> numbers[n])
                 .average();

         return average.getAsDouble();
     }
 }
