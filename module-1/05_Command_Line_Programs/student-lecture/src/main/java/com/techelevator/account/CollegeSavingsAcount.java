package com.techelevator.account;

import java.math.BigDecimal;

public class CollegeSavingsAcount extends Savings {

	private String school;
	
	public CollegeSavingsAcount(BigDecimal openingBalance, String accountNumber, BigDecimal openingInterestRate, String school) {
		super (openingBalance, accountNumber, openingInterestRate);
		this.school = school;
	}

}
