package com.nhnacademy.springbootjpa.repository.querydsl;


import com.nhnacademy.springbootjpa.entity.Products;
import com.nhnacademy.springbootjpa.entity.QProducts;
import com.nhnacademy.springbootjpa.entity.QReviews;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CustomProductRepositoryImpl implements CustomProductRepository {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<Products> findProductsHavingReviewsMoreThan(int minReviewCount) {
        QProducts product = QProducts.products;
        QReviews review = QReviews.reviews;

        return queryFactory
                .select(product)
                .from(product)
                .join(product.reviews, review)
                .groupBy(product)
                .having(review.count().gt(minReviewCount))
                .fetch();
    }
}
