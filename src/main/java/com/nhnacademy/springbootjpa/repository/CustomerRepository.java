package com.nhnacademy.springbootjpa.repository;

import com.nhnacademy.springbootjpa.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customers, Long> {
    Customers findByEmailAddress(String emailAddress);
}
