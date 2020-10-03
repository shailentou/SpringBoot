package com.accounting.account.bean;

public class Account {

	String id;
	String AccountName;
	String AccountType;
	
	
	public Account(String id, String accountName, String accountType) {
		super();
		this.id = id;
		AccountName = accountName;
		AccountType = accountType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccountName() {
		return AccountName;
	}
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	
	
}
