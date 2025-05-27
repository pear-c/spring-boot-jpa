package com.nhnacademy.springbootjpa.repository;

import com.nhnacademy.springbootjpa.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long> {
    Orders findByCustomers_CustomerId(long customerId);
}
