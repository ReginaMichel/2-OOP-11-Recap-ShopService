package org.example;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Order(Customer customer, Product product, int quantity,
                    BigDecimal totalPrice, LocalDateTime timestamp) {
}
