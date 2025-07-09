package org.example;

import java.time.LocalDateTime;

public record Order(Customer customer, Product product, int quantity,
                    LocalDateTime timestamp) {
}
