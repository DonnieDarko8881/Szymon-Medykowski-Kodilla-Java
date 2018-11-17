package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsersForum = forum.getUsersList().stream()
                .filter(user -> user.getSexUser() == 'M')
                .filter(user -> user.getDateBirthday().getYear() >= 1998)
                .filter(user -> user.getPostNumber() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdUser, user -> user));

        System.out.println("# elements: " + theResultMapOfUsersForum.size());
        theResultMapOfUsersForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}