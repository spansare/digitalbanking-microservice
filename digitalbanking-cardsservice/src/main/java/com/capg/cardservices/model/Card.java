package com.capg.cardservices.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity

@Table(name = "card")

@NamedQueries({
   
	
	@NamedQuery(name = "com.capg.cardservices.Card.GetByCustomerId", query= " from Card c where c.customerId = :customerId")

})


public class Card {

	public Card()
	{}
	
	//card_no
@Id
@Column(name = "card_no")

	long cardNo ;
	//cvv
	
@Column(name = "cvv")

int cvv;
	//expiry_date
@Column(name = "expiry_date")

	Date expiryDate;
	//card_type
@Column(name = "card_type")

	String cardType; 
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCardCompany() {
		return cardCompany;
	}
	public void setCardCompany(String cardCompany) {
		this.cardCompany = cardCompany;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public boolean isCardStatus() {
		return cardStatus;
	}
	public void setCardStatus(boolean cardStatus) {
		this.cardStatus = cardStatus;
	}
	//customer_id
	@Column(name = "customer_id")

	int customerId;
	//card_company
	@Column(name = "card_company")

	String cardCompany;
	//credit_limit
	@Column(name = "credit_limit")

	double creditLimit;  
	//card_status
	@Column(name = "card_status")

	boolean cardStatus ;
	
	
}
