package com.capg.cardservices.service;

import java.util.List;


import com.capg.cardservices.model.Card;
import com.capg.cardservices.model.Customer;


public interface CardService {

	public List<Card> getAccountList(Customer customer);
	public Card getAccountDetails(Customer customer, Card account);
	
	//public List getAccountTransactions(Customer customer);
	

}
