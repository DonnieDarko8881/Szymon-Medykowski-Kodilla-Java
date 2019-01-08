package com.kodilla.good.patterns.challanges.FOOD2Order.deliver;

public class Deliver {
    private final DeliverName deliverName;
    private final int telephoneNumber;
    private final String email;

    public Deliver(DeliverName deliverName, int telephoneNumber, String email) {
        this.deliverName = deliverName;

        this.telephoneNumber = telephoneNumber;
        this.email = email;
    }

    public DeliverName getDeliverName() {
        return deliverName;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
