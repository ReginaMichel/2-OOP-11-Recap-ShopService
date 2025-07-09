package org.example;

import java.time.LocalDateTime;

public class ShopService {

    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public ShopService(OrderRepo orderRepo) {
        this.productRepo = new ProductRepo();
        this.orderRepo = orderRepo;
    }
    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public void order (Customer customer, Product product, int quantity) {
        if (productRepo.amountOfSpecificProduct(product) >= quantity) {
            Order newOrder = new Order(customer, product, quantity,
                    LocalDateTime.now());
            orderRepo.add(newOrder);
            productRepo.removeAmountOfProduct(quantity, product);
            System.out.println(quantity + " items of " + product.name()
            + " ordered.");
        } else {
            System.out.println("Product could not be ordered. There are only "
            + productRepo.amountOfSpecificProduct(product) + " items available.");
        }
    }
}
