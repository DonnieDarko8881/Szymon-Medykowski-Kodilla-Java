package com.kodilla.good.patterns.challanges.Food2Order;

import com.kodilla.good.patterns.challanges.FOOD2Order.Food2OrderProcessor;
import com.kodilla.good.patterns.challanges.FOOD2Order.informationService.MailService;
import com.kodilla.good.patterns.challanges.FOOD2Order.order.OrderRequest;
import com.kodilla.good.patterns.challanges.FOOD2Order.order.OrderRequestRetrivier;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopOrderServices.ExtraFoodShopOrderService;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopOrderServices.GlutenFreeShopOrderService;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopOrderServices.HealthyShopOrderService;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopProcessor.ExtraFoodOrderProcessor;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopProcessor.GlutenFreeShopOrderProcessor;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopProcessor.HealthyShopOrderProcessor;
import org.junit.*;


public class Food2OrderTestSuit {

    @Test
    public void returnTrueHealthyShopProcess() {
        //Given
        OrderRequestRetrivier orderRequestRetrivier = new OrderRequestRetrivier();
        OrderRequest orderRequest = orderRequestRetrivier.retrieve0();

        //When
        Food2OrderProcessor food2OrderProcessor = new Food2OrderProcessor(new HealthyShopOrderService(),
                new HealthyShopOrderProcessor(), new MailService());
        boolean processResult = food2OrderProcessor.process(orderRequest);
        food2OrderProcessor.informAboutRealization(orderRequest);

        //Then
        Assert.assertEquals(true, processResult);
    }

    @Test
    public void returnTrueExtraFoodShopProcess() {
        //Given
        OrderRequestRetrivier orderRequestRetrivier = new OrderRequestRetrivier();
        OrderRequest orderRequest = orderRequestRetrivier.retrieve1();

        //When
        Food2OrderProcessor food2OrderProcessor = new Food2OrderProcessor(new ExtraFoodShopOrderService(),
                new ExtraFoodOrderProcessor(), new MailService());
        boolean processResult = food2OrderProcessor.process(orderRequest);
        food2OrderProcessor.informAboutRealization(orderRequest);

        //Then
        Assert.assertEquals(true, processResult);
    }

    @Test
    public void returnFalseGlutenFreeShopProcess() {
        //Given
        OrderRequestRetrivier orderRequestRetrivier = new OrderRequestRetrivier();
        OrderRequest orderRequest = orderRequestRetrivier.retrieve2();

        //When
        Food2OrderProcessor food2OrderProcessor = new Food2OrderProcessor(new GlutenFreeShopOrderService(),
                new GlutenFreeShopOrderProcessor(), new MailService());
        boolean processResult = food2OrderProcessor.process(orderRequest);
        food2OrderProcessor.informAboutRealization(orderRequest);

        //Then
        Assert.assertEquals(false, processResult);
    }

}
