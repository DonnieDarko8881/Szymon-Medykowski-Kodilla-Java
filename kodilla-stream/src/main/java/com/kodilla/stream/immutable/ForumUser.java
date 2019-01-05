package com.kodilla.stream.immutable;


import java.util.Date;
import java.util.Objects;

final public class ForumUser {
    private final String username;
    private final String realName;
    private final Date dateCreatedForumUser;

    public ForumUser(String username, String realName, Date dateCreatedForumUser) {
        this.username = username;
        this.realName = realName;
        this.dateCreatedForumUser = new Date(dateCreatedForumUser.getTime());

    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public Date getDateCreatedForumUser() {
        return new Date(dateCreatedForumUser.getTime());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return Objects.equals(username, forumUser.username) &&
                Objects.equals(realName, forumUser.realName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, realName);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", dateBirthDay=" + dateCreatedForumUser +
                '}';
    }
}

