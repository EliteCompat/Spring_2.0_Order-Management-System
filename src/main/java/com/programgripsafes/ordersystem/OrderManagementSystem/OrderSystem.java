package com.programgripsafes.ordersystem.OrderManagementSystem;

import org.springframework.stereotype.Component;

@Component
public class OrderSystem implements InterfaceOrderSystem{
    public int orderNumber;

    public void incrementOrderNumber(int orderNumber){

        System.out.println("Ordernumber before imcrementing is (OrderSystem): "+ orderNumber);
        orderNumber=orderNumber+1;
        System.out.println("Ordernumber AFTER imcrementing is (OrderSystem): "+ orderNumber);

    }
}
