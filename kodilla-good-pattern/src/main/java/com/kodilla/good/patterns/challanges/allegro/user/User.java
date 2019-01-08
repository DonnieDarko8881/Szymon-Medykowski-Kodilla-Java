package com.kodilla.good.patterns.challanges.allegro.user;

import java.util.Objects;

final public class User {
    final private String name;
    final private String surname;
    final private int telephoneNumber;
    final private String mail;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return telephoneNumber == user.telephoneNumber &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(mail, user.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, telephoneNumber, mail);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", mail='" + mail + '\'' +
                '}';
    }
}
