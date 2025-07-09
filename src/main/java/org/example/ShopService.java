package org.example;

import java.time.LocalDateTime;

public class ShopService {

    private ProductRepo productRepo;
    private OrderListRepo orderListRepo;

    public ShopService() {
        this.productRepo = new ProductRepo();
        this.orderListRepo = new OrderListRepo();
    }
    public ShopService(ProductRepo productRepo, OrderListRepo orderListRepo) {
        this.productRepo = productRepo;
        this.orderListRepo = orderListRepo;
    }

    public void order (Customer customer, Product product, int quantity) {
        if (productRepo.amountOfSpecificProduct(product) >= quantity) {
            Order newOrder = new Order(customer, product, quantity,
                    LocalDateTime.now());
            orderListRepo.addOrder(newOrder);
            productRepo.removeAmountOfProduct(quantity, product);
            System.out.println(quantity + " items of " + product.name()
            + " ordered.");
        } else {
            System.out.println("Product could not be ordered. There are only "
            + productRepo.amountOfSpecificProduct(product) + " items available.");
        }
    }
}
