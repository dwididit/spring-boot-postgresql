package org.store.productapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "productname", nullable = false, length = 255)
    private String productName;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    // No need for explicit getters and setters thanks to Lombok

    // You can still add additional methods or custom logic if needed
}
