package com.kodilla.good.patterns.challanges.FOOD2Order.User;

public final class User {

    private final String name;
    private final String surname;
    private final int telephoneNumber;
    private final String mail;

    public User(String name, String surname, int telephoneNumber, String mail) {
        this.name = name;
        this.surname = surname;
        this.telephoneNumber = telephoneNumber;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getMail() {
        return mail;
    }
}
