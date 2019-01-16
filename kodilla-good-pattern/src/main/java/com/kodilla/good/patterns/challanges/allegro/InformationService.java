package com.kodilla.good.patterns.challanges.allegro;

import com.kodilla.good.patterns.challanges.allegro.user.User;

public interface InformationService {
    void informConfirmation(User user);
    void informRejection(User user);
}
