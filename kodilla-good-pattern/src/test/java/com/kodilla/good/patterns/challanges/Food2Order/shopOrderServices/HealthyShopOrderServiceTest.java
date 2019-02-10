package com.kodilla.good.patterns.challanges.Food2Order.shopOrderServices;

import com.kodilla.good.patterns.challanges.FOOD2Order.order.OrderRequest;
import com.kodilla.good.patterns.challanges.FOOD2Order.order.OrderRequestRetrivier;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopOrderServices.GlutenFreeShopOrderService;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopOrderServices.HealthyShopOrderService;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HealthyShopOrderServiceTest {

    @Test
    public void returnTrueOrder() {
        //Given
        HealthyShopOrderService healthyShopOrderService = new HealthyShopOrderService();
        OrderRequestRetrivier orderRequestRetrivier = new OrderRequestRetrivier();
        OrderRequest orderRequest = orderRequestRetrivier.retrieve0();

        //When
        boolean expectedResult = healthyShopOrderService.order(orderRequest);

        //Then
        Assert.assertEquals(true, expectedResult);
    }
}