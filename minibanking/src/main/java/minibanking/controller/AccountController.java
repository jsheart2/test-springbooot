package minibanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import minibanking.model.Account;
import minibanking.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@GetMapping(path = "/", produces = "application/son")
	public List<Account> getAccount(){
		return accountService.getAccount();
	}
	
	@GetMapping(path = "/{id}", produces = "application/json")
	public void getByNo(@PathVariable("id") Integer id) {
		accountService.getAllAccount(id);
	}
	
	@PostMapping(path = "/", consumes = "application/json", produces = "application/json")
	public void addTransfer(@RequestBody Account account) {
	        accountService.addTransfer(account);
	}
	
    //@PostMapping(path = "/", consumes = "application/json", produces = "application/json")
	//public Account addTransfer(@RequestBody Account account) {
	//  BigDecimal transfer = BigDecimal.ZERO;
	//  for (Overbooking rekening : account.getCustomerId()) {
	//      rekening.getAccount();
	//      transfer = transfer.add(rekening.getAmount().multiply(new BigDecimal(rekening.getToAccount())));
	//  }
	//  account.setBalance(transfer);
	//  accountService.addTransfer(account);
	//        return account;
	//}
}
