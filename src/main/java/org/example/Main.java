package org.example;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product zahnpasta = new Product("Zahnpasta",
                "Reinigungsmittel für Zähne",
                new BigDecimal("1.99"));
        ProductRepo store = new ProductRepo();
        store.addProduct(zahnpasta);
        store.addProduct(zahnpasta);
        store.addProduct(zahnpasta);
        store.addProduct(zahnpasta);
        store.addProduct(zahnpasta);
        store.addProduct(zahnpasta);
        System.out.println(store.getStoredProducts());
        System.out.println(store.amountOfSpecificProduct(zahnpasta));
        store.removeProductType(zahnpasta);
        System.out.println(store.getStoredProducts());
    }
}