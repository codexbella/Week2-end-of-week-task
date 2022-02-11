package de.codexbella;

import java.util.List;

public class Order {
    private int orderID;
    private List<Product> products;

    public Order(int id, List<Product> products) {
        this.orderID = id;
        this.products = products;
    }

    public String toString() {
        return null;//TODO Stringausgabe für Order implementieren
    }
}
