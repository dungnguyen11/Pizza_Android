package com.example.sam.pizza;

/**
 * Created by kinouhaiiro on 5/19/17.
 */

class Item {
    Order order;

    int type;
    int amount;

    Item(int type) {
        this.type = type;
        this.amount = 0;
    }

    void increase() {
        ++this.amount;
    }

    void decrease() {
        --this.amount;
    }
}
