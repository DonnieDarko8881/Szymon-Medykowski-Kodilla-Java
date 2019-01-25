package com.kodilla.patterns.builder.bigmac;

public enum Ingredients {
    LETTUCE("lettuce"), ONION("onion"), BACON("bacon"), CUCUMBER("cucumber"),
    PEPPERS("peppers"), CHILLI("chilli"), MUSHROOMS("mushrooms"), SHRIMPS("shrimps"), CHEESE("cheese");
    private String name;

    Ingredients(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
