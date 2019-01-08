package com.kodilla.good.patterns.challanges.FOOD2Order.shopProcessor;

import com.kodilla.good.patterns.challanges.FOOD2Order.User.User;
import com.kodilla.good.patterns.challanges.FOOD2Order.deliver.Deliver;
import com.kodilla.good.patterns.challanges.FOOD2Order.food.Food;
import com.kodilla.good.patterns.challanges.FOOD2Order.informationService.InformationService;
import com.kodilla.good.patterns.challanges.FOOD2Order.order.OrderRequest;

public class HealthyShopOrderProcessor implements OrderProcessor {

    boolean availabilityOfProduct = checkAvailabilityOfProduct();

    @Override
    public boolean process(OrderRequest orderRequest, InformationService informationService) {
        if (availabilityOfProduct) {
            claimOrder(orderRequest);
            informationService.informClaimOrder(orderRequest.getUser());
            preparingFood(orderRequest.getFood());
            orderDeliver(orderRequest.getUser(), orderRequest.getDeliver());
            informationService.informDeliverOrdered(orderRequest.getUser());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkAvailabilityOfProduct() {
        return true;
    }

    @Override
    public boolean claimOrder(OrderRequest order) {
        return false;
    }

    @Override
    public boolean preparingFood(Food food) {
        return false;
    }

    @Override
    public boolean orderDeliver(User user, Deliver deliver) {
        return false;
    }
}
