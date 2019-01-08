package com.kodilla.good.patterns.challanges.FOOD2Order.order;

import com.kodilla.good.patterns.challanges.FOOD2Order.deliver.Deliver;
import com.kodilla.good.patterns.challanges.FOOD2Order.food.Food;
import com.kodilla.good.patterns.challanges.FOOD2Order.User.User;

import java.time.LocalDateTime;

public final class OrderRequest {
    private final User user;
    private final Deliver deliver;
    private final Food food;
    private final int howManyFood;
    private final LocalDateTime dateOfOrder;

    public OrderRequest(User user, Deliver deliver, Food food, int howManyFood, LocalDateTime dateOfOrder) {
        this.user = user;
        this.deliver = deliver;
        this.food = food;
        this.howManyFood = howManyFood;
        this.dateOfOrder = dateOfOrder;
    }

    public User getUser() {
        return user;
    }

    public Deliver getDeliver() {
        return deliver;
    }

    public Food getFood() {
        return food;
    }

    public int getHowManyFood() {
        return howManyFood;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }
}
