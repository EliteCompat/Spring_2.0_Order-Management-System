package com.programgripsafes.ordersystem.OrderManagementSystem.Beans;

import com.programgripsafes.ordersystem.OrderManagementSystem.OrderSystem;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    @Autowired
    private OrderSystem orderSystem;

    @PostConstruct
    public void init() {
        int orderNumber = 0;
        orderSystem.incrementOrderNumber(orderNumber);
        System.out.println("The new ordernumber is (MyBean): " + orderNumber);
    }
}
