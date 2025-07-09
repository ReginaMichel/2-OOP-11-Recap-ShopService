package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderMapRepo implements OrderRepo {
    HashMap<Integer, Order> orders;
    int next;

    public OrderMapRepo() {
        orders = new HashMap<>();
        next = 0;
    }
    public OrderMapRepo(HashMap<Integer, Order> orders) {
        this.orders = orders;
        next = orders.size();
    }

    public void add (Order newOrder) {
        this.orders.put(next, newOrder);
        next++;
    }

    public void remove (Order order) {
        // HashMap können Elemente nur über den Key entfernen.
        // HashMap besitzen keine getKey(value) methode, daher muss erst
        // über einen Umweg, der Key bestimmt werden.
        for (Integer key: this.orders.keySet()) {
            if (this.orders.get(key).equals(order)) {
                this.orders.remove(key);
            }
        }
    }

    public Order getSingle (int id) {
        return this.orders.get(id);
    }
    public ArrayList<Order> getAll() {
        ArrayList<Order> orderList = new ArrayList<>();
        for (Integer key: this.orders.keySet()) {
            orderList.add(this.orders.get(key));
        }
        return orderList;
    }
}
