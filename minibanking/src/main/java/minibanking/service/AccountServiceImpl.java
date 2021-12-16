package minibanking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import minibanking.dao.AccountDAO;
import minibanking.model.Account;

@Service
@Transactional(readOnly = true)
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDAO accountDAO;

	@Override
	@Transactional(readOnly = false)
	public void addTransfer(Account account) {
		accountDAO.addTransfer(account);
	}

	@Override
	@Transactional(readOnly = false)
	public Account getAllAccount(Integer account) {
		return accountDAO.getAllAccount(account);
	}

	@Override
	public List<Account> getAccount() {
		return accountDAO.getAccount();
	}
}