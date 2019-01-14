package com.kodilla.good.patterns.challanges.Flights.flightRetriever;

public enum City {
    KRAKÓW("Krakow"), POZNAN("Poznań"), WARSZAWA("Warsaw"), WROCŁAW("Wrocław"), ŁÓDŹ("łódź");
    String nameOfCity;

    City(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }

    public String getNameOfCity() {
        return nameOfCity;
    }


}
