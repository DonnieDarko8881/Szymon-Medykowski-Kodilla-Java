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
import org.hamcrest.CoreMatchers;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class Food2OrderTestSuit {
    private static int testCounter;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void ReturnTrueHealthyShopProcess() {
        //Given
        OrderRequestRetrivier orderRequestRetrivier0 = new OrderRequestRetrivier();
        OrderRequest orderRequest0 = orderRequestRetrivier0.retrieve0();

        //When
        Food2OrderProcessor food2OrderProcessor0 = new Food2OrderProcessor(new HealthyShopOrderService(),
                new HealthyShopOrderProcessor(), new MailService());
        boolean processResult = food2OrderProcessor0.process(orderRequest0);
        food2OrderProcessor0.informAboutRealization(orderRequest0);

        //Then
        Assert.assertEquals(true, processResult);
    }

    @Test
    public void ReturnTrueExtraFoodShopProcess() {
        //Given
        OrderRequestRetrivier orderRequestRetrivier1 = new OrderRequestRetrivier();
        OrderRequest orderRequest1 = orderRequestRetrivier1.retrieve1();

        //When
        Food2OrderProcessor food2OrderProcessor1 = new Food2OrderProcessor(new ExtraFoodShopOrderService(),
                new ExtraFoodOrderProcessor(), new MailService());
        boolean processResult = food2OrderProcessor1.process(orderRequest1);
        food2OrderProcessor1.informAboutRealization(orderRequest1);

        //Then
        Assert.assertEquals(true, processResult);
    }

    @Test
    public void ReturnFalseGlutenFreeShopProcess() {
        //Givern
        OrderRequestRetrivier orderRequestRetrivier2 = new OrderRequestRetrivier();
        OrderRequest orderRequest2 = orderRequestRetrivier2.retrieve2();

        //When
        Food2OrderProcessor food2OrderProcessor2 = new Food2OrderProcessor(new GlutenFreeShopOrderService(),
                new GlutenFreeShopOrderProcessor(), new MailService());
         boolean processResult=food2OrderProcessor2.process(orderRequest2);
        food2OrderProcessor2.informAboutRealization(orderRequest2);

        //Then
        Assert.assertEquals(false, processResult);
    }

}
