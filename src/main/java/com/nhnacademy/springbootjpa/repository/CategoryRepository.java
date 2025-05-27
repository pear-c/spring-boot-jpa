package com.nhnacademy.springbootjpa.repository;

import com.nhnacademy.springbootjpa.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Categories, Long> {
    Categories findByCategoryName(String categoryName);
}
