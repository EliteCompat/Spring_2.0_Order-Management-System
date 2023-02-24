package com.programgripsafes.ordersystem.OrderManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderManagementSystemApplication {

	@Autowired
	private static OrderSystem orderSystem;
	private static int orderNumberMain;


	public static void main(String[] args) {
		SpringApplication.run(OrderManagementSystemApplication.class, args);

		System.out.println("HI @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Pn pls (Main)");

		// orderNumberMain = OrderSystem. // Sad try to get the variable from OrderSystem to print it out

		System.out.println("Hi, your order number is (Main): " + orderNumberMain);

	}

}
