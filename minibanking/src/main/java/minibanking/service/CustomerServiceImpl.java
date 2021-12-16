package minibanking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import minibanking.dao.CustomerDAO;
import minibanking.model.Customer;

@Service
@Transactional(readOnly = true)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;
	
	@Override
	public List<Customer> getAllCustomer() {
		return customerDAO.getAllCustomer();
	}

	@Override
	public Customer getById(Integer customerId) {
		return customerDAO.getById(customerId);
	}


}
