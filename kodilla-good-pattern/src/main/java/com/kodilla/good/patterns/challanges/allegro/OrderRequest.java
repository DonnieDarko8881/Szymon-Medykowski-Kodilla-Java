package com.kodilla.good.patterns.challanges.allegro;

import com.kodilla.good.patterns.challanges.allegro.subject.Subject;
import com.kodilla.good.patterns.challanges.allegro.user.User;

import java.time.LocalDateTime;

public class OrderRequest {
    final private User user;
    final private Subject subject;
    final private LocalDateTime dateOfOrder;

    public OrderRequest(User user, Subject subject, LocalDateTime dateOfOrder) {
        this.user = user;
        this.subject = subject;
        this.dateOfOrder = dateOfOrder;
    }

    public User getUser() {
        return user;
    }

    public Subject getSubject() {
        return subject;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "user=" + user +
                ", subject=" + subject +
                ", dateOfOrder=" + dateOfOrder +
                '}';
    }
}
