package com.kodilla.good.patterns.challanges.FOOD2Order.informationService;

import com.kodilla.good.patterns.challanges.FOOD2Order.User.User;

public interface InformationService {
    void informConfirmationOfRealisation(User user);

    void informRejectionOfRealisation(User user);

    void informClaimOrder(User user);

    void informFoodPrepared(User user);

    void informDeliverOrdered(User user);
}
