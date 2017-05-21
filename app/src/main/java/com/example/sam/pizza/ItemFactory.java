package com.example.sam.pizza;

/**
 * Created by kinouhaiiro on 5/19/17.
 */

class ItemFactory {
    static ItemFactory singletonInstance = new ItemFactory();

    private ItemFactory() {}

    Item createItem(String itemName) {
        switch(itemName) {
            case "Margherita":
                return new Item(0);
            case "Pepperoni":
                return new Item(1);
            case "Pepsi":
                return new Item(2);
            case "Aquafina":
                return new Item(3);
            default:
                return null;
        }
    }
}
