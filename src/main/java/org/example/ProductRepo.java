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

    public ArrayList<Product> getStoredProducts() {
        return storedProducts;
    }

    public void addProduct(Product newProduct) {
        this.storedProducts.add(newProduct);
    }
    public void removeSingleProduct(Product product) {
        this.storedProducts.remove(product);
    }
    public int amountOfSpecificProduct(Product product) {
        int count = 0;
        for (Product p : this.storedProducts) {
            if (p.equals(product)) {
                count++;
            }
        }
        return count;
    }
    public void removeProductType(Product product) {
        int count = amountOfSpecificProduct(product);
        for (int i = 0; i < count; i++) {
            removeSingleProduct(product);
        }
    }
    public void removeAllProducts() {
        this.storedProducts.clear();
    }
}
