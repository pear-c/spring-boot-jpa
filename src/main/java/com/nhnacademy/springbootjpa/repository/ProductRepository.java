package com.nhnacademy.springbootjpa.repository;

import com.nhnacademy.springbootjpa.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductRepository extends JpaRepository<Products, Long> {
    List<Products> findByCategories_CategoryId(long categoryId);
}
