package com.kodilla.good.patterns.challanges.FOOD2Order.shopOrderServices;

import com.kodilla.good.patterns.challanges.FOOD2Order.order.OrderRequest;

public class GlutenFreeShopOrderService implements FoodOrderService {
    @Override
    public boolean order(OrderRequest orderRequest) {
        return true;
    }
}
