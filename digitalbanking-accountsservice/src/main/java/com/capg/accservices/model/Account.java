package com.capg.accservices.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component

@Entity
@Table(name = "Account")

public class Account {

		@Id
	
	@Column(name="account_no")

	private int accountNo;
	
	@Column(name="customer_id")
	private int customerId;
  
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Date getAccountCreationDate() {
		return accountCreationDate;
	}
	public void setAccountCreationDate(Date accountCreationDate) {
		this.accountCreationDate = accountCreationDate;
	}
	public boolean isAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(boolean accountStatus) {
		this.accountStatus = accountStatus;
	}
	@NotNull
	@Column(name="ifsc_code")
	private String ifscCode;
	  @NotNull
		@Column(name="account_type")

	private  String accountType;
	  @NotNull
		@Column(name="account_balance")

	  private double accountBalance;
		@Column(name="account_creation_date")

	  private Date accountCreationDate;
	  @NotNull

		@Column(name="account_status  	")
	private boolean accountStatus;
	
}
