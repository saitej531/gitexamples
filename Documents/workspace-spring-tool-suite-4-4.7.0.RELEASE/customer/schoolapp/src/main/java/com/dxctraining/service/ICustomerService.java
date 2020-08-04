package details.service;

import java.util.List;

import details.entities.Customer;

public interface ICustomerService {
	

	Customer findByCustomerId(String CustomerId);
	
		


	List<Customer> findAll() ;
	
	Customer updateCustomerId(String CustomerId);

	void add(Customer customer);
	
	Customer update(Customer customer);
	
	void delete(String CustomerId);
	
	
	
	  
	
	
	
}

