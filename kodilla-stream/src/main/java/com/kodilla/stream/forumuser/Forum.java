package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum(){

        usersList.add(new ForumUser(1001,"Donnie",Sex.MEN,
                LocalDate.of(1955,10,04),0));
        usersList.add(new ForumUser(1002,"Kamil",Sex.GENDER,
                LocalDate.of(1955,8,30),0));
        usersList.add(new ForumUser(1003,"Kamila",Sex.FEMALE,
                LocalDate.of(1986,10,04),3));
        usersList.add(new ForumUser(1004,"Paulina",Sex.FEMALE,
                LocalDate.of(1999,10,04),2));
        usersList.add(new ForumUser(1005,"Harry",Sex.GENDER,
                LocalDate.of(1998,10,04),2));
        usersList.add(new ForumUser(1006,"Harry",Sex.MEN,
                LocalDate.of(1998,10,04),2));
        usersList.add(new ForumUser(1007,"Harry",Sex.MEN,
                LocalDate.of(1998,10,04),2));
    }



    public List<ForumUser> getUsersList() {
        return new ArrayList<>(usersList);
    }
}
