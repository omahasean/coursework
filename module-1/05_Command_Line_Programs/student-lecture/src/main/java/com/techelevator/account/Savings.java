package com.techelevator.account;

import java.math.BigDecimal;

public class Savings extends Account {
	
	private BigDecimal interestRate;
	
	public Savings(BigDecimal openingBalance, String accountNumber, BigDecimal openingInterestRate) {
		super(openingBalance, accountNumber);
		this.interestRate = openingInterestRate;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}
}
