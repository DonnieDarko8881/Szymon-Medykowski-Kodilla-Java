package com.kodilla.good.patterns.challanges.Food2Order.shopOrderServices;

import com.kodilla.good.patterns.challanges.FOOD2Order.order.OrderRequest;
import com.kodilla.good.patterns.challanges.FOOD2Order.order.OrderRequestRetrivier;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopOrderServices.ExtraFoodShopOrderService;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopOrderServices.GlutenFreeShopOrderService;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GlutenFreeShopOrderServiceTest {

    @Test
    public void returnTrueOrder() {
        //Given
        GlutenFreeShopOrderService glutenFreeShopOrderService = new GlutenFreeShopOrderService();
        OrderRequestRetrivier orderRequestRetrivier = new OrderRequestRetrivier();
        OrderRequest orderRequest = orderRequestRetrivier.retrieve0();

        //When
        boolean expectedResult = glutenFreeShopOrderService.order(orderRequest);

        //Then
        Assert.assertEquals(true, expectedResult);
    }
}