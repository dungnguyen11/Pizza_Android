package com.example.sam.pizza;

import java.util.ArrayList;

/**
 * Created by kinouhaiiro on 5/19/17.
 */

abstract class User {
    ArrayList<Order> orders;
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
