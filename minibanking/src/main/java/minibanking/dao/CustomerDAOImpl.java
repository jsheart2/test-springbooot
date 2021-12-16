package minibanking.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import minibanking.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getAllCustomer() {
        return sessionFactory.getCurrentSession().createQuery("from Customer", Customer.class).list();
	}

	@Override
	public Customer getById(Integer customerId) {
        return sessionFactory.getCurrentSession().get(Customer.class, customerId);
	}

}
