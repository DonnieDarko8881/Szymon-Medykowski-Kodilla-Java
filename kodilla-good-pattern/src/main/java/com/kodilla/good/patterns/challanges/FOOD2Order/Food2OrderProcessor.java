package com.kodilla.good.patterns.challanges.FOOD2Order;

import com.kodilla.good.patterns.challanges.FOOD2Order.informationService.InformationService;
import com.kodilla.good.patterns.challanges.FOOD2Order.informationService.MailService;
import com.kodilla.good.patterns.challanges.FOOD2Order.order.OrderRequest;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopOrderServices.FoodOrderService;
import com.kodilla.good.patterns.challanges.FOOD2Order.shopProcessor.OrderProcessor;

public class Food2OrderProcessor {
    private FoodOrderService foodOrderService;
    private OrderProcessor orderProcessor;
    private InformationService informationService;
    private boolean isRealized;

    public Food2OrderProcessor(FoodOrderService foodOrderService, OrderProcessor orderProcessor, InformationService informationService) {
        this.foodOrderService = foodOrderService;
        this.orderProcessor = orderProcessor;
        this.informationService = informationService;
    }

    public boolean process(final OrderRequest orderRequest) {
        boolean isOrdered = foodOrderService.order(orderRequest);

        if (isOrdered) {
            isRealized = orderProcessor.process(orderRequest, informationService);
            return isRealized;
        } else {
            return isRealized = false;
        }
    }

    public String informAboutRealization(final OrderRequest orderRequest) {
        if (isRealized) {
            return informationService.informConfirmationOfRealisation(orderRequest.getUser());
        } else {
            return informationService.informRejectionOfRealisation(orderRequest.getUser());
        }
    }


}
