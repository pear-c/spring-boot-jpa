package com.nhnacademy.springbootjpa.entity;

import java.math.BigDecimal;

public interface ProductSummary {
    Long getProductId();
    String getModelName();
    BigDecimal getUniCost();
}
