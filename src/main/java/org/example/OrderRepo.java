package org.example;

import java.util.ArrayList;

public interface OrderRepo {
    public void add (Order newOrder);
    public void remove (Order order);
    public Order getSingle (int id);
    public ArrayList<Order> getAll ();
}
