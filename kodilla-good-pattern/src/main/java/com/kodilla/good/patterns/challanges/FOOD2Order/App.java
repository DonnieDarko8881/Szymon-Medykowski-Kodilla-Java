package com.kodilla.good.patterns.challanges.FOOD2Order;

import com.kodilla.good.patterns.challanges.FOOD2Order.informationService.MailService;
import com.kodilla.good.patterns.challanges.FOOD2Order.order.OrderRequest;
import com.kodilla.good.patterns.challanges.FOOD2Order.order.OrderRequestRetrivier;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopOrderServices.ExtraFoodShopOrderService;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopOrderServices.GlutenFreeShopOrderService;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopOrderServices.HealthyShopOrderService;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopProcessor.ExtraFoodOrderProcessor;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopProcessor.GlutenFreeShopOrderProcessor;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopProcessor.HealthyShopOrderProcessor;

public class App {
    public static void main(String[] args) {
        OrderRequestRetrivier orderRequestRetrivier0 = new OrderRequestRetrivier();
        OrderRequest orderRequest0 = orderRequestRetrivier0.retrieve0();

        Food2OrderProcessor food2OrderProcessor0 = new Food2OrderProcessor(new HealthyShopOrderService(),
                new HealthyShopOrderProcessor(), new MailService());
        food2OrderProcessor0.process(orderRequest0);
        food2OrderProcessor0.informAboutRealization(orderRequest0);


        OrderRequestRetrivier orderRequestRetrivier1 = new OrderRequestRetrivier();
        OrderRequest orderRequest1 = orderRequestRetrivier1.retrieve1();

        Food2OrderProcessor food2OrderProcessor1 = new Food2OrderProcessor(new ExtraFoodShopOrderService(),
                new ExtraFoodOrderProcessor(), new MailService());
        food2OrderProcessor1.process(orderRequest1);
        food2OrderProcessor1.informAboutRealization(orderRequest1);

        
        OrderRequestRetrivier orderRequestRetrivier2 = new OrderRequestRetrivier();
        OrderRequest orderRequest2 = orderRequestRetrivier2.retrieve2();

        Food2OrderProcessor food2OrderProcessor2 = new Food2OrderProcessor(new GlutenFreeShopOrderService(),
                new GlutenFreeShopOrderProcessor(), new MailService());
        food2OrderProcessor2.process(orderRequest2);
        food2OrderProcessor2.informAboutRealization(orderRequest2);
    }
}
