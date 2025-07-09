package org.example;

import java.util.ArrayList;

public class OrderListRepo {
    ArrayList<Order> orders;

    public OrderListRepo() {
        this.orders = new ArrayList<>();
    }
    public OrderListRepo(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
    public void printOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public void addOrder(Order newOrder) {
        this.orders.add(newOrder);
    }

    public void deleteOrder(Order order) {
        this.orders.remove(order);
    }
}
