package minibanking.dao;

import java.util.List;

import minibanking.model.Account;

public interface AccountDAO {
	
	void addTransfer(Account account);
    Account getAllAccount(Integer account);
	List<Account> getAccount();
}
