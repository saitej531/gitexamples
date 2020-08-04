package details.dao;

import details.entities.*;

import details.exception.CustomerNotFoundException;

import java.util.*;

public class CustomerDaoImpl  {

	private Map<String, Customer> store = new HashMap<>();

	private int fecthid;

	private String fecthCustomerId;

	private String fecthCustomerId() {
		fecthid++;
		String idstr = String.valueOf(fecthid);
		return fecthCustomerId;

	}

	public Customer findByCustomerId(String CustomerId) {
		Customer customer = store.get(CustomerId);
		if (customer == null) {
			throw new CustomerNotFoundException("Customer not found for CustomerId=" + CustomerId);
		}
		return customer;
	}


	public List<Customer> findAll() {
		Collection<Customer> values = store.values();
		List<Customer> list = new ArrayList<>();
		for (Customer value : values) {
			list.add(value);
		}
		return list;
	}

	public void add(Customer customer) {

		String CustomerId = fecthCustomerId();
		store.put(CustomerId, customer);

	}

	public Customer updateName(String CustomerId) {
		Customer customer = findByCustomerId(CustomerId);
		return customer;
	}

	public Customer update(Customer customer) {
		String CustomerId = customer.getcustomerId();
		store.put(CustomerId, customer);
		return customer;
	}

	public void delete(String CustomerId) {
		store.remove(CustomerId);
	}

}
