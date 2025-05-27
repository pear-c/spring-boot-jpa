package com.nhnacademy.springbootjpa.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Entity
public class OrderDetails {
    @EmbeddedId
    private Pk pk;

    private int quantity;
    private BigDecimal unitCost;

    @NoArgsConstructor
    @EqualsAndHashCode
    @Getter
    @Embeddable
    public static class Pk implements Serializable {
        private int orderId;
        private int productId;
    }
}


