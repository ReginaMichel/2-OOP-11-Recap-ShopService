package org.example;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String address;
    private ArrayList<Order> orders;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }
    public void changeAdress(String newAddress) {
        this.address = newAddress;
    }
    public void viewOrders() {
        System.out.println("Customer name: " + name + " has ordered:");
        for (Order order: orders) {
            System.out.println(order);
        }
    }
}
