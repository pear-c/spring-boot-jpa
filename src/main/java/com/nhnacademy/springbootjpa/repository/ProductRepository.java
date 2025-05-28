package com.nhnacademy.springbootjpa.repository;

import com.nhnacademy.springbootjpa.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProductRepository extends JpaRepository<Products, Long> {
    List<Products> findByCategories_CategoryId(long categoryId);

    @Query("SELECT p FROM Products p WHERE p.uniCost > :uniCost")
    List<Products> findAllByUniCostAtLeastByQueryParam(long uniCost);

    @Modifying
    @Query("UPDATE Products p SET p.modelName = :modelName WHERE p.productId = :productId")
    void updateModelNameByProductId(String modelName, long productId);
}
