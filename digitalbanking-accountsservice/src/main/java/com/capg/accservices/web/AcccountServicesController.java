package com.capg.accservices.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.accservices.dao.AccountRepository;
import com.capg.accservices.model.Account;

@RestController

@ComponentScan("com.capg.accservices")

@EnableAutoConfiguration
public class AcccountServicesController {

	@Autowired
	private AccountRepository accountDao;
	
    
	@RequestMapping(value="/accservices/{customerId}/accounts",method = RequestMethod.GET)
    @ResponseBody
       public List<Account> getAccounts(@PathVariable  int customerId) {
       
    	//Customer customer=new Customer();
    	//customer.setCustomerId(customerId);
    	return accountDao.findByCustomerId(customerId);
    }
	
	@RequestMapping(value="/accservices/{accountNo}/account",method = RequestMethod.GET)
    @ResponseBody
       public Account getAccount(@PathVariable  int accountNo) {
       
    	//Customer customer=new Customer();
    	//customer.setCustomerId(customerId);
    	return accountDao.findByAccountNo(accountNo);
    }
	
	/*@RequestMapping(value="/",method = RequestMethod.GET)
    @ResponseBody
       public String getAccount() {
       
    	return "Hi Snehal!!";
    }*/
	
}
