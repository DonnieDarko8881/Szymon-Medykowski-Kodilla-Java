package com.kodilla.good.patterns.challanges.FOOD2Order.shopProcessor;

import com.kodilla.good.patterns.challanges.FOOD2Order.User.User;
import com.kodilla.good.patterns.challanges.FOOD2Order.deliver.Deliver;
import com.kodilla.good.patterns.challanges.FOOD2Order.food.Food;
import com.kodilla.good.patterns.challanges.FOOD2Order.informationService.InformationService;
import com.kodilla.good.patterns.challanges.FOOD2Order.order.OrderRequest;


public interface OrderProcessor {
    boolean process(OrderRequest order, InformationService informationService);

    boolean checkAvailabilityOfProduct();

    boolean claimOrder(OrderRequest order);

    boolean preparingFood(Food food);

    boolean orderDeliver(User user, Deliver deliver);


}
