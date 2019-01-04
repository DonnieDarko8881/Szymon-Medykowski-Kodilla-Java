package com.kodilla.stream.immutable;


import java.util.Date;
import java.util.Objects;

final public class ForumUser {
    private final String username;
    private final String fullName;
    private final Date registrationDate;

    public ForumUser(String username, String realName, Date registrationDate) {
        this.username = username;
        this.fullName = fullName;
        this.registrationDate = new Date(registrationDate.getTime());

    }

    public String getUsername() {
        return username;
    }

    public String getfullName() {
        return fullName;
    }

    public Date getRegistrationDate() {
        return new Date(registrationDate.getTime());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return Objects.equals(username, forumUser.username) &&
                Objects.equals(fullName, forumUser.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, fullName);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", realName='" + fullName + '\'' +
                ", dateBirthDay=" + dateCreatedForumUser +
                '}';
    }
}

