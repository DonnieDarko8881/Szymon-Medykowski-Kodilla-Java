package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int idUser;
    private final String nameUser;
    private final char sexUser;
    private final LocalDate dateBirthday;
    private final int postNumber;

    public ForumUser(int idUser, String nameUser, char sexUser, LocalDate dateBirthday, int postNumber) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.sexUser = sexUser;
        this.dateBirthday = dateBirthday;
        this.postNumber = postNumber;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSexUser() {
        return sexUser;
    }

    public LocalDate getDateBirthday() {
        return dateBirthday;
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idUser=" + idUser +
                ", nameUser='" + nameUser + '\'' +
                ", sexUser=" + sexUser +
                ", dateBirthday=" + dateBirthday +
                ", postNumber=" + postNumber +
                '}';
    }
}
