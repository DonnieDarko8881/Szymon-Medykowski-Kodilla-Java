package com.kodilla.good.patterns.challanges.allegro;

import com.kodilla.good.patterns.challanges.allegro.subject.Subject;
import com.kodilla.good.patterns.challanges.allegro.user.User;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(User user, Subject subject, LocalDateTime dateOfCreatingOrder) {
        return true;
    }
}
