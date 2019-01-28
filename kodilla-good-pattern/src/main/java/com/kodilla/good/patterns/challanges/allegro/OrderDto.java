package com.kodilla.good.patterns.challanges.allegro;

import com.kodilla.good.patterns.challanges.allegro.user.User;

public final class OrderDto {
    public final User user;
    public final Boolean isOrdered;

    public OrderDto(User user, Boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Boolean getOrdered() {
        return isOrdered;
    }
}
