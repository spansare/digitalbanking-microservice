package com.capg.accservices.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.accservices.model.Account;
import com.capg.accservices.model.Customer;

@Service
public interface AccountService {

	public List<Account> getAccountList(Customer customer);
	public Account getAccountDetails(Customer customer, Account account);
	
	//public List getAccountTransactions(Customer customer);
	

}
