package de.codexbella;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {
    private List<Order> orderList;

    public OrderRepo(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Order getOrder(int id) {
        List<Order> orderList = this.orderList;
        for (int i = 0; i < orderList.size(); i++) {
            Order currentOrder = orderList.get(i);
            if (currentOrder.getOrderID() == id) {
                return currentOrder;
            }
        }
        return null;
    }
}
