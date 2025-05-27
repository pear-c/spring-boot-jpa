package com.nhnacademy.springbootjpa.repository;

import com.nhnacademy.springbootjpa.entity.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Reviews, Long> {
    Reviews findByProducts_ProductId(long productId);
    Reviews findByCustomers_CustomerId(long customerId);
}
