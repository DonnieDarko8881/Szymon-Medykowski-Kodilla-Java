package com.kodilla.good.patterns.challanges.allegro;

import com.kodilla.good.patterns.challanges.allegro.user.User;

public class MailService implements InformationService {

    public void informConfirmation(User user) {
        System.out.println("Dear "+ user.getName() + " \nYour order was confirmed");
    }

    public void informRejection(User user) {
        System.out.println("Dear "+ user.getName() + " \nYour order was rejected");
    }
}
