package com.crm.springdemo.dao;

import java.util.List;

import com.crm.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getAllCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int customerId);
}
