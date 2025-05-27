package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private int productId;
    private LocalDateTime dateCreated;

    public ShoppingCart() {
        dateCreated = LocalDateTime.now();
    }
}
