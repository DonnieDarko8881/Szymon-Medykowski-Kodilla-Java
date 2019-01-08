package com.kodilla.good.patterns.challanges.allegro;

import com.kodilla.good.patterns.challanges.allegro.subject.Subject;
import com.kodilla.good.patterns.challanges.allegro.user.User;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retieve(){
        User user = new User("Donnie","Darko",795972529,"s.medykowski@gmail.com");
        Subject subject = new Subject("laptop", 10000,1000.99);
        LocalDateTime dateOfOrder= LocalDateTime.of(2018,1,6,23,43);

        return new OrderRequest(user,subject,dateOfOrder);
    }

}
