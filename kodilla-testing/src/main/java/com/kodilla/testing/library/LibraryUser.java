package com.kodilla.testing.library;

import java.util.Objects;

public final class LibraryUser {
    final private String firstName;
    final private String lastName;
    final private String peselId;

    public LibraryUser(String firstname, String lastname, String peselId) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.peselId = peselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPeselId() {
        return peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(peselId, that.peselId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, peselId);
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }
}
