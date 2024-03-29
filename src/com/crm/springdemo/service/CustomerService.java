package com.crm.springdemo.service;

import java.util.List;

import com.crm.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int customerId);
}
