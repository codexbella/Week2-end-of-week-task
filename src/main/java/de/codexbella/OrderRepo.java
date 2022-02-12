package de.codexbella;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {
    private List<Order> orderList;

    public OrderRepo(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Order getOrder(int i) {
        List<Product> productList = new ArrayList<>();
        Order order = new Order(9999, productList);
        return order;
    }
}
