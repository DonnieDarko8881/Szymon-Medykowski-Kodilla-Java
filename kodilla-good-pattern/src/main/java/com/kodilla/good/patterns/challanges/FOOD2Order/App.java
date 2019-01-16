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
    }
}
