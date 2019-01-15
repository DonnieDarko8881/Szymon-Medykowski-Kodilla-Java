package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    public String getUserName(final String userName ) {
        return userName;
    }
}
