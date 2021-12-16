package minibanking.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import minibanking.model.Overbooking;

@Repository
public class OverbookingDAOImpl implements OverbookingDAO{

    @Autowired
    private SessionFactory sessionFactory;

	@Override
	public void addOverBooking(Overbooking overbooking) {
		sessionFactory.getCurrentSession().save(overbooking);
	}

	@Override
	public List<Overbooking> getAllPost() {
		return sessionFactory.getCurrentSession().createQuery("New Saldo ", Overbooking.class).list();
	}
    
}
