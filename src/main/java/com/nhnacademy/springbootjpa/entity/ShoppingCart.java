package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long recordId;

    private String cartId;
    private long quantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products productId;

    private LocalDateTime dateCreated;

    public ShoppingCart() {
        dateCreated = LocalDateTime.now();
    }
}
