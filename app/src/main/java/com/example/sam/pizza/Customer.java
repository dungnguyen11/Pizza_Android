package com.example.sam.pizza;

/**
 * Created by kinouhaiiro on 5/19/17.
 */

public class Customer extends User {
    Customer(String username, String password) {
        super(username, password);
    }

    void placeOrder(String address, String phone) {
        Order newOder = new Order(address, phone, this);
    }
}
