package com.kodilla.good.patterns.challanges.allegro;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isRented = orderService.order(orderRequest.getUser(), orderRequest.getSubject(),
                orderRequest.getDateOfOrder());

        if(isRented){
            informationService.informConfirmation(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),orderRequest.getSubject(),orderRequest.getDateOfOrder());
            return new OrderDto(orderRequest.getUser(),true);
        } else {
            informationService.informRejection(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
