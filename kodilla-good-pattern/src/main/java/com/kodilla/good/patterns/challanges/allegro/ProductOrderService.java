package com.kodilla.good.patterns.challanges.allegro;

import com.kodilla.good.patterns.challanges.allegro.subject.Subject;
import com.kodilla.good.patterns.challanges.allegro.user.User;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {
    public boolean order(final User user, final Subject subject, final LocalDateTime dateOfOrder){
        return true;
    }

}
