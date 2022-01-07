package com.rikkei.mock_customers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rikkei.mock_customers.dto.CustomerDTO;
import com.rikkei.mock_customers.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
	@Query(value = "select new com.rikkei.mock_customers.dto.CustomerDTO;(" +
            "c.id, c.name, count(p.id), sum(p.price)" +
            ") from Customer c left join Order p on c.id = p.customer_id" +
            " order by sum(p.price) desc")
    public List<CustomerDTO> getListCustomerDTO();
	//Đang thiếu phần ứng với "limit 10"
}
