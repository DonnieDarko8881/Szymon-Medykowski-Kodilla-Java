package com.kodilla.good.patterns.challanges.allegro;

import com.kodilla.good.patterns.challanges.allegro.subject.Subject;
import com.kodilla.good.patterns.challanges.allegro.user.User;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createOrder(final User user, final Subject subject, final LocalDateTime dateOfCreatingOrder);
}
