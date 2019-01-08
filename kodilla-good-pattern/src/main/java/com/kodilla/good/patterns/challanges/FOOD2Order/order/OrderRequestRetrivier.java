package com.kodilla.good.patterns.challanges.FOOD2Order.order;

import com.kodilla.good.patterns.challanges.FOOD2Order.User.User;
import com.kodilla.good.patterns.challanges.FOOD2Order.deliver.Deliver;
import com.kodilla.good.patterns.challanges.FOOD2Order.deliver.DeliverName;
import com.kodilla.good.patterns.challanges.FOOD2Order.food.Food;
import com.kodilla.good.patterns.challanges.FOOD2Order.food.TypeOfFood;

import java.time.LocalDateTime;

public class OrderRequestRetrivier {
    public OrderRequest retrieve0(){
        User user = new User("Donnie","Darko",795972529,"s.medykowski@gmail.com");
        Deliver deliver = new Deliver(DeliverName.DPD, 23123,"uber@gmail.com");
        Food food = new Food("burger", TypeOfFood.HEALTHY,"zdrowy burger",20.5);
        LocalDateTime dateOfOrder= LocalDateTime.of(2018,1,6,23,43);
        return new OrderRequest(user, deliver, food, 1, dateOfOrder);
    }

    public OrderRequest retrieve1(){
        User user = new User("Karolina","Marchewka",600206759,"karolina.marchewka@sitel.com");
        Deliver deliver = new Deliver(DeliverName.UPS, 23123,"dpd@gmail.com");
        Food food = new Food("Double McRoyal", TypeOfFood.FASTFOOD,"pyszny burger",20.5);
        LocalDateTime dateOfOrder= LocalDateTime.of(2018,1,8,23,07);
        return new OrderRequest(user, deliver, food, 1, dateOfOrder);
    }

    public OrderRequest retrieve2(){
        User user = new User("Ilona","Rogala",518337720,"ilona.rogala@sitel.com");
        Deliver deliver = new Deliver(DeliverName.UBER, 23123,"uber@gmail.com");
        Food food = new Food("Pizza Gluten Free", TypeOfFood.GLUTEENFREE,"Pizza bez Glutenu",15.0);
        LocalDateTime dateOfOrder= LocalDateTime.of(2019,1,8,23,05);
        return new OrderRequest(user, deliver, food, 1, dateOfOrder);
    }
}
