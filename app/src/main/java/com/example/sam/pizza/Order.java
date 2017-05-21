package com.example.sam.pizza;

import java.util.ArrayList;

/**
 * Created by kinouhaiiro on 5/19/17.
 */

class Order {
    ArrayList<Item> items;
    Customer customer;
    Chef chef;
    Deliverer deliverer;

    String address;
    String phone;
    int totalCost;
    int waitTime;
    int status;

    Order(String address, String phone, Customer customer) {
        this.customer = customer;
        this.address = address;
        this.phone = phone;
    }
}
