package com.rikkei.mock_customers.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rikkei.mock_customers.model.Customer;
import com.rikkei.mock_customers.repository.CustomerRepository;

@Service		//đánh dấu tầng service
@Transactional		//đánh dấu class là transaction
public class CustomerService {
	
	@Autowired
	private CustomerRepository repo;
	
	public List<Customer> listAll() {
		return repo.findAll();
	}
	
	public void save(Customer customer) {
		repo.save(customer);
	}
	
	public Customer get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}
