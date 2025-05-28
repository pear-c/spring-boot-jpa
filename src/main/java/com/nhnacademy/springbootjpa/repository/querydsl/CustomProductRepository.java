package com.nhnacademy.springbootjpa.repository.querydsl;

import com.nhnacademy.springbootjpa.entity.Products;

import java.util.List;

public interface CustomProductRepository {
    List<Products> findProductsHavingReviewsMoreThan(int minReviewCount);
}
