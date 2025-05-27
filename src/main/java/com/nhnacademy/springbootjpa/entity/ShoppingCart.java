package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Entity
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recordId;
    private String cartId;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products productId;
    private LocalDateTime dateCreated;

    public ShoppingCart() {
        dateCreated = LocalDateTime.now();
    }
}
