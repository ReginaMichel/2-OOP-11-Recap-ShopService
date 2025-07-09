package org.example;

import java.util.ArrayList;

public class ProductRepo {
    private ArrayList<Product> storedProducts;

    public ProductRepo() {
        this.storedProducts = new ArrayList<>();
    }
    public ProductRepo(ArrayList<Product> storedProducts) {
        this.storedProducts = storedProducts;
    }
}
