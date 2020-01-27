package com.techelevator.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ATMachine {
	 
	
	public static void main (String[] args) {
		
		Savings savings = new Savings(new BigDecimal(50), "12341234123", new BigDecimal(5.7));  //open account with $50
		CheckingAccount checking = new CheckingAccount(new BigDecimal (25), "98476123", true);
		
		List<Account> myList = new ArrayList<Account>();
		myList.add(savings);
		myList.add(checking);
		
		for(Account a : myList) {
			System.out.println(a.getBalance());
		}
		BigDecimal newBalance = checking.deposit(new BigDecimal(1000));
		System.out.println("Opening Balance for Account: "+ checking.getAccountNumber()+ " "+ "is "+ checking.getBalance()+ " " + "New Balance After Deposit: " + newBalance);
	
		newBalance = checking.withdrawal(new BigDecimal(25));
		System.out.println("Opening Balance for Account: "+ checking.getAccountNumber()+ " "+ "is "+ checking.getBalance()+ " " + "New Balance After Deposit: " + newBalance);
	
	}

}
