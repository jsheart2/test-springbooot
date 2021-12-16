package minibanking.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import minibanking.model.Account;

@Repository
public class AccountDAOImpl implements AccountDAO{

    @Autowired
    private SessionFactory sessionFactory;

	@Override
	public Account getAllAccount(Integer account) {
		return sessionFactory.getCurrentSession().get(Account.class, account);
	}

	@Override
	public void addTransfer(Account account) {
		sessionFactory.getCurrentSession().	save(account);
	}
	
	@Override
	public List<Account> getAccount(){
		return sessionFactory.getCurrentSession().createQuery("from Account", Account.class).list();
	}
}
