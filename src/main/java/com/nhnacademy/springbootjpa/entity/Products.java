package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categories categories;

    private String modelNumber;
    private String modelName;
    private String productImage;
    private BigDecimal uniCost;
    private String description;
}
