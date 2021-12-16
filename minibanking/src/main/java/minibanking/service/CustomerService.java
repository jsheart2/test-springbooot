package minibanking.service;

import java.util.List;

import minibanking.model.Customer;

public interface CustomerService {
	
	Customer getById(Integer customerId);
	List<Customer> getAllCustomer();

}
