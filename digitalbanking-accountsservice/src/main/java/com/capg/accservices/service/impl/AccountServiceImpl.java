package com.capg.accservices.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capg.accservices.dao.AccountRepository;
import com.capg.accservices.model.Account;
import com.capg.accservices.model.Customer;

@Component
@Resource

public class AccountServiceImpl {

    @Autowired
	private AccountRepository accountDao;
	List<Account> accountList=null;
	public List getAccountList(Customer customer)
	{
		
		accountList= accountDao.findByCustomerId(customer.getCustomerId());
		int size=accountList.size();
		System.out.println("size of the account"+size);
		return accountList;
	
	}
	/*public Account getAccountDetails(Customer customer, Account account)
	{
		
		accountDao.getAccountDetails(customer, account);
	}*/
}
