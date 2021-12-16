package minibanking.dao;

import java.util.List;

import minibanking.model.Customer;

public interface CustomerDAO {
	Customer getById(Integer customerId);
    List<Customer> getAllCustomer();

}
