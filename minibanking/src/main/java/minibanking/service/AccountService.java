package minibanking.service;

import java.util.List;

import minibanking.model.Account;

public interface AccountService {
	void addTransfer(Account account);
    Account getAllAccount(Integer account);
    List<Account> getAccount();
}