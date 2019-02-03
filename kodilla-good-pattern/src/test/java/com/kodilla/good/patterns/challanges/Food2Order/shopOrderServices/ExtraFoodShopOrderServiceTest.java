package com.kodilla.good.patterns.challanges.Food2Order.shopOrderServices;

import com.kodilla.good.patterns.challanges.FOOD2Order.order.OrderRequest;
import com.kodilla.good.patterns.challanges.FOOD2Order.order.OrderRequestRetrivier;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopOrderServices.ExtraFoodShopOrderService;
import org.junit.Assert;
import org.junit.Test;
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

import static org.junit.Assert.*;

public class ExtraFoodShopOrderServiceTest {

    @Test
    public void returnTrueOrder() {
        //Given
        ExtraFoodShopOrderService extraFoodShopOrderService = new ExtraFoodShopOrderService();
        OrderRequestRetrivier orderRequestRetrivier = new OrderRequestRetrivier();
        OrderRequest orderRequest = orderRequestRetrivier.retrieve0();

        //When
        boolean expectedResult = extraFoodShopOrderService.order(orderRequest);

        //Then
        Assert.assertEquals(true, expectedResult);
    }
}