package com.techelevator.account;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private List<Account> myAccounts = new ArrayList<Account>();

	public List<Account> getMyAccounts() {
		return myAccounts;
	}

	public void setMyAccounts(List<Account> myAccounts) {
		this.myAccounts = myAccounts;
	}

}
