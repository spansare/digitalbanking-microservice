package com.capg.cardservices.service.impl;

import java.util.List;

import javax.annotation.Resource;


import com.capg.cardservices.dao.CardDAO;
import com.capg.cardservices.model.Card;
import com.capg.cardservices.model.Customer;


public class CardServiceImpl {

	private CardDAO cardDao;
	List<Card> cardList=null;
	public List getAccountList(Customer customer)
	{
		
		cardList= cardDao.findByCustomerId(customer.getCustomerId());
		int size=cardList.size();
		System.out.println("size of the account"+size);
		return cardList;
	
	}
	/*public Account getAccountDetails(Customer customer, Account account)
	{
		
		accountDao.getAccountDetails(customer, account);
	}*/
}
