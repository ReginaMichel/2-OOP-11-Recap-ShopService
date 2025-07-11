package org.example;

import java.util.ArrayList;

public class OrderListRepo implements OrderRepo {
    ArrayList<Order> orders;

    public OrderListRepo() {
        this.orders = new ArrayList<>();
    }
    public OrderListRepo(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Order> getAll() {
        return orders;
    }
    public void printOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
    public Order getSingle (int id) {
        return orders.get(id);
    }

    public void add(Order newOrder) {
        this.orders.add(newOrder);
    }

    public void remove(Order order) {
        if (orders.contains(order)) {
            this.orders.remove(order);
        }
    }

    public void replace (Order oldOrder, Order newOrder) {
        if (orders.contains(oldOrder)) {
            this.orders.remove(oldOrder);
            this.orders.add(newOrder);
        }
    }
}
