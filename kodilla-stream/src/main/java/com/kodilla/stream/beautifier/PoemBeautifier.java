package com.kodilla.stream.beautifier;

import java.util.function.Function;

public class PoemBeautifier {

    public String beautify(String beautify, PoemDecorator beautifier) {

        return beautifier.decorate(beautify);
    }
}


