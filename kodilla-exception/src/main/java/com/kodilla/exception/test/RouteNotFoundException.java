package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.List;

public class RouteNotFoundException extends RuntimeException {

    public RouteNotFoundException(String message) {
        super(message);
    }


}
