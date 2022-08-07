package com.crm.springdemo.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.crm.springdemo.dao.CustomerDAO;
import com.crm.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// Note: Repository annotation is always applied to DAO implementations!!!

	// inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getAllCustomers() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);

		// execute the query and get result list
		List<Customer> customers = query.getResultList();

		// return the list
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(customer);
	}

}
