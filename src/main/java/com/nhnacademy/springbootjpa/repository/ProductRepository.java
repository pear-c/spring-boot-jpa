package com.nhnacademy.springbootjpa.repository;

import com.nhnacademy.springbootjpa.entity.ProductSummary;
import com.nhnacademy.springbootjpa.entity.Products;
import com.nhnacademy.springbootjpa.repository.querydsl.CustomProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;


public interface ProductRepository extends JpaRepository<Products, Long>, CustomProductRepository {
    List<Products> findByCategories_CategoryId(long categoryId);

//    @Query("SELECT p FROM Products p WHERE p.uniCost > :uniCost")
//    List<Products> findAllByUniCostAtLeastByQueryParam(long uniCost);

    // Pageable 적용
    @Query("SELECT p FROM Products p WHERE p.uniCost > :uniCost")
    Page<ProductSummary> findAllByUniCostGreaterThan(@Param("uniCost")BigDecimal uniCost, Pageable pageable);


    @Modifying
    @Query("UPDATE Products p SET p.modelName = :modelName WHERE p.productId = :productId")
    void updateModelNameByProductId(String modelName, long productId);

    Page<ProductSummary> findByCategories_CategoryId(long categoryId, Pageable pageable);
}
