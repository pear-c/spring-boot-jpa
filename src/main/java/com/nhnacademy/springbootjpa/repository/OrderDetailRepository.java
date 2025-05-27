package com.nhnacademy.springbootjpa.repository;

import com.nhnacademy.springbootjpa.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetails, Long> {
}
