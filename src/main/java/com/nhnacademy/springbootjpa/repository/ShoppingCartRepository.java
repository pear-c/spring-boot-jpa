package com.nhnacademy.springbootjpa.repository;

import com.nhnacademy.springbootjpa.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
}
