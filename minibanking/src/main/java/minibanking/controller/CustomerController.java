package minibanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import minibanking.model.Customer;
import minibanking.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	  @Autowired
	    private CustomerService customerService;
	  
	 @GetMapping(path = "/", produces = "application/json")
	 public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();	 
	 }
	 
	 @GetMapping(path = "/{id}", produces = "application/json")
	 public void getById(@PathVariable("id") Integer id) {
		 customerService.getById(id);
	 }

}
