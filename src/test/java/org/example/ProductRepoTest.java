package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    Product zahnpasta;
    Product marmelade;
    ProductRepo store;

    @BeforeEach
    void setUp() {
        zahnpasta = new Product("Zahnpasta",
                "Reinigungsmittel für Zähne",
                new BigDecimal("1.99"));
        marmelade = new Product("Erdbeermarmelade",
                "Erdbeermarmelade",
                new BigDecimal("2.99"));
        store = new ProductRepo();
        store.addProduct(zahnpasta);
        store.addProduct(zahnpasta);
        store.addProduct(zahnpasta);
        store.addProduct(zahnpasta);
        store.addProduct(zahnpasta);
        store.addProduct(zahnpasta);
    }

    @Test
    void getStoredProducts() {
        ArrayList<Product> expected = new ArrayList<>();
        expected.add(zahnpasta);
        expected.add(zahnpasta);
        expected.add(zahnpasta);
        expected.add(zahnpasta);
        expected.add(zahnpasta);
        expected.add(zahnpasta);
        assertEquals(expected, store.getStoredProducts());
    }

    @Test
    void amountOfSpecificProduct() {
        assertEquals(6, store.amountOfSpecificProduct(zahnpasta));
    }

    @Test
    void addProduct() {
        ArrayList<Product> expected = new ArrayList<>();
        expected.add(zahnpasta);
        expected.add(zahnpasta);
        expected.add(zahnpasta);
        expected.add(zahnpasta);
        expected.add(zahnpasta);
        expected.add(zahnpasta);
        assertEquals(expected, store.getStoredProducts());
    }

    @Test
    void addAmountOfSpecificProduct() {
        store.addAmountOfSpecificProduct(5, marmelade);
        ArrayList<Product> expected = new ArrayList<>();
        expected.add(zahnpasta);
        expected.add(zahnpasta);
        expected.add(zahnpasta);
        expected.add(zahnpasta);
        expected.add(zahnpasta);
        expected.add(zahnpasta);
        expected.add(marmelade);
        expected.add(marmelade);
        expected.add(marmelade);
        expected.add(marmelade);
        expected.add(marmelade);
        assertEquals(expected, store.getStoredProducts());
    }
}