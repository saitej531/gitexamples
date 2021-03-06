package details.service;

import java.util.*;
import details.dao.*;
import details.entities.*;
import details.exception.*;

import details.entities.Customer;

public class CustomerServiceImpl {

	private ICustomerDao dao = (ICustomerDao) new CustomerDaoImpl();

	public Customer findByCustomerId(String CustomerId) {

		checkCustomerId(CustomerId);
		Customer customer = dao.findByCustomerId(CustomerId);
		return customer;
	}

	private void checkCustomerId(String CustomerId) {
		if (CustomerId < 1) {
			throw new InvalidArgumentException("CustomerId cant be negative, CustomerId passed=" + CustomerId);
		}

	}

	public List<Customer> findAll() {

		List<Customer> list = dao.findAll();
		return list;
	}

	public Customer updateCustomerId(String CustomerId) {

		checkCustomerId(CustomerId);

		Customer customer = dao.updateCustomerId(CustomerId);
		return customer;
	}

	private void checkName(String name) {

		if (name == null || name.isEmpty()) {
			throw new InvalidArgumentException("name can't be null or empty");

		}

	}

	private void checkCustomer(Customer customer) {

		if (customer == null) {
			throw new InvalidArgumentException("Customer can't be null or empty");
		}

	}

	public void add(Customer customer) {

		checkCustomer(customer);
		dao.add(customer);
	}

	public Customer update(Customer customer) {

		checkCustomer(customer);
		customer = dao.Update(Customer);
		return customer;
	}

	public void delete(int id) {

		checkCustomerId(CustomerId);
		dao.delete(CustomerId);

	}

}