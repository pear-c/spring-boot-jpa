package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customers;

    private int rating;
    private String comments;
}
