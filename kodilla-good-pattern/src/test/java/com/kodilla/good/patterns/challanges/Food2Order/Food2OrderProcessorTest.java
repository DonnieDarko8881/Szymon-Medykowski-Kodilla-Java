package com.kodilla.good.patterns.challanges.Food2Order;

import com.kodilla.good.patterns.challanges.FOOD2Order.Food2OrderProcessor;
import com.kodilla.good.patterns.challanges.FOOD2Order.informationService.InformationService;
import com.kodilla.good.patterns.challanges.FOOD2Order.informationService.MailService;
import com.kodilla.good.patterns.challanges.FOOD2Order.order.OrderRequest;
import com.kodilla.good.patterns.challanges.FOOD2Order.order.OrderRequestRetrivier;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopOrderServices.FoodOrderService;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopProcessor.OrderProcessor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class Food2OrderProcessorTest {


    @Mock
    private FoodOrderService foodOrderService;

    @Mock
    private InformationService informationService;

    @Mock
    private OrderProcessor orderProcessor;

    @InjectMocks
    private Food2OrderProcessor food2OrderProcessor;

    @Test
    public void shouldReturnTrueProcessIfprocessOfOrderProcessIsTrue() {
        //Given
        OrderRequestRetrivier orderRequestRetrivier0 = new OrderRequestRetrivier();
        OrderRequest orderRequest0 = orderRequestRetrivier0.retrieve0();


        when(foodOrderService.order(orderRequest0)).thenReturn(true);
        when(orderProcessor.process(orderRequest0, informationService)).thenReturn(true);

        //When
        boolean isOrdered = foodOrderService.order(orderRequest0);
        boolean result = food2OrderProcessor.process(orderRequest0);

        //Then

        Assert.assertEquals(true, isOrdered);
        Assert.assertEquals(true, result);

    }

    @Test
    public void shouldReturnFalseProcessIfprocessOfOrderProcessIsTrue() {
        //Given
        OrderRequestRetrivier orderRequestRetrivier0 = new OrderRequestRetrivier();
        OrderRequest orderRequest0 = orderRequestRetrivier0.retrieve0();


        when(foodOrderService.order(orderRequest0)).thenReturn(true);
        when(orderProcessor.process(orderRequest0, informationService)).thenReturn(false);

        //When
        boolean isOrdered = foodOrderService.order(orderRequest0);
        boolean result = food2OrderProcessor.process(orderRequest0);

        //Then

        Assert.assertEquals(true, isOrdered);
        Assert.assertEquals(false, result);

    }

    @Test
    public void shouldReturnFalseProcessIfOrderReturnFalse() {
        //Given
        OrderRequestRetrivier orderRequestRetrivier0 = new OrderRequestRetrivier();
        OrderRequest orderRequest0 = orderRequestRetrivier0.retrieve0();

        when(foodOrderService.order(orderRequest0)).thenReturn(false);

        //When
        boolean result = food2OrderProcessor.process(orderRequest0);

        //Then
        Assert.assertEquals(false, result);

    }

    @Test
    public void messageShouldContainRealizedInInformationOfRealization() {
        //given
        OrderRequestRetrivier orderRequestRetrivier0 = new OrderRequestRetrivier();
        OrderRequest orderRequest0 = orderRequestRetrivier0.retrieve0();

        Food2OrderProcessor food2OrderProcessor = new Food2OrderProcessor(foodOrderService, orderProcessor, new MailService());

        when(foodOrderService.order(orderRequest0)).thenReturn(true);
        when(orderProcessor.process(orderRequest0, informationService)).thenReturn(true);
        when(food2OrderProcessor.process(orderRequest0)).thenReturn(true);


        //when
        food2OrderProcessor.process(orderRequest0);
        String result = food2OrderProcessor.informAboutRealization(orderRequest0);


        //then
        Assert.assertEquals(true, result.contains("realized"));
    }

    @Test
    public void messageShouldContainRejectedInInformationOfRealizationIfOrderdReturnFalse() {
        //given
        OrderRequestRetrivier orderRequestRetrivier0 = new OrderRequestRetrivier();
        OrderRequest orderRequest0 = orderRequestRetrivier0.retrieve0();

        Food2OrderProcessor food2OrderProcessor = new Food2OrderProcessor(foodOrderService, orderProcessor, new MailService());

        when(foodOrderService.order(orderRequest0)).thenReturn(false);
        when(food2OrderProcessor.process(orderRequest0)).thenReturn(false);


        //when
        food2OrderProcessor.process(orderRequest0);
        String result = food2OrderProcessor.informAboutRealization(orderRequest0);


        //then
        Assert.assertEquals(true, result.contains("rejected"));
    }

    @Test
    public void messageShouldContainRejectedInInformationOfRealizationIfProcessOfOrderProcessReturnFalse() {
        //given
        OrderRequestRetrivier orderRequestRetrivier0 = new OrderRequestRetrivier();
        OrderRequest orderRequest0 = orderRequestRetrivier0.retrieve0();

        Food2OrderProcessor food2OrderProcessor = new Food2OrderProcessor(foodOrderService, orderProcessor, new MailService());

        when(foodOrderService.order(orderRequest0)).thenReturn(true);
        when(orderProcessor.process(orderRequest0, informationService)).thenReturn(false);
        when(food2OrderProcessor.process(orderRequest0)).thenReturn(false);


        //when
        food2OrderProcessor.process(orderRequest0);
        String result = food2OrderProcessor.informAboutRealization(orderRequest0);


        //then
        Assert.assertEquals(true, result.contains("rejected"));
    }
}