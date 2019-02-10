package com.kodilla.good.patterns.challanges.FOOD2Order.informationService;

import com.kodilla.good.patterns.challanges.FOOD2Order.User.User;

public class MailService implements InformationService {

    @Override
    public String informConfirmationOfRealisation(User user) {
        return "Dear " + user.getName() + " " + user.getSurname() + "!\n" +"Your Order was realized";
    }

    @Override
    public String informRejectionOfRealisation(User user) {
        return "Dear " + user.getName() + " " + user.getSurname() + "!\n"+ "Your Order was rejected";
    }

    @Override
    public void informClaimOrder(User user) {
        System.out.println("Dear " + user.getName() + " " + user.getSurname() + "!");
        System.out.println("Your Order was claimed");
    }

    @Override
    public void informFoodPrepared(User user) {
        System.out.println("Dear " + user.getName() + " " + user.getSurname() + "!");
        System.out.println("Your Food was prepared");
    }

    @Override
    public void informDeliverOrdered(User user) {
        System.out.println("Dear " + user.getName() + " " + user.getSurname() + "!");
        System.out.println("Deliver is driving to you ");
    }

}
