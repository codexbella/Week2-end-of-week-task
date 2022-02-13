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
        for (int i = 0; i < orderList.size(); i++) {//TODO durch for each ersetzen
            Order currentOrder = orderList.get(i);
            if (currentOrder.getOrderID() == id) {
                return currentOrder;
            }
        }
        throw new RuntimeException("No such order in order repo.");//TODO noch richtig implementieren und testen
    }

    public List<Order> getOrders() {
        return orderList;
    }

    public void newOrder(List<Product> productsForOrder) {
        int newOrderID = orderList.get(orderList.size()-1).getOrderID() + 1;
        Order newOrder = new Order(newOrderID, productsForOrder);
        orderList.add(newOrder);
    }
}
