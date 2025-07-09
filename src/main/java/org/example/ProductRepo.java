package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ProductRepo {
    private ArrayList<Product> storedProducts;

    // Konstruktoren für leere oder bereits gefüllte Lagerhäuser
    public ProductRepo() {
        this.storedProducts = new ArrayList<>();
    }
    public ProductRepo(ArrayList<Product> storedProducts) {
        this.storedProducts = storedProducts;
    }

    // Methoden, um Produkte oder ihre Anzahl zurückzugeben
    public ArrayList<Product> getStoredProducts() {
        return storedProducts;
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

    // Methoden, um Produkte hinzuzufügen
    public void addProduct(Product newProduct) {
        this.storedProducts.add(newProduct);
    }
    public void addAmountOfSpecificProduct(int amount, Product newProduct) {
        for (int i = 0; i < amount; i++) {
            this.storedProducts.add(newProduct);
        }
    }
    public void addMultipleProducts(ArrayList<Product> newProducts) {
        this.storedProducts.addAll(newProducts);
    }

    // Methoden, um Produkte zu entfernen
    public void removeSingleProduct(Product product) {
        this.storedProducts.remove(product);
    }
    public void removeAmountOfProduct(int amount, Product product) {
        for (int i = 0; i < amount; i++) {
            removeSingleProduct(product);
        }
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
