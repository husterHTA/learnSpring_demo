package com.rikkei.mock_customers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rikkei.mock_customers.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
