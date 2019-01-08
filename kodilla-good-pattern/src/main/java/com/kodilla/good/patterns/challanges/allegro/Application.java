package com.kodilla.good.patterns.challanges.allegro;

import com.kodilla.good.patterns.challanges.allegro.subject.Subject;
import com.kodilla.good.patterns.challanges.allegro.user.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever= new OrderRequestRetriever();
        OrderRequest orderRequest= orderRequestRetriever.retieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(),
                new ProductOrderService(),new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
