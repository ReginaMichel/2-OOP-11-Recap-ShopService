package org.example;

import java.math.BigDecimal;

public record Product(String name, String description, BigDecimal price) {
}
