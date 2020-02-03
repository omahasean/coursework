package com.techelevator;

import org.junit.*;

public class CigarPartyTest {
	CigarParty party;
	@Before
	public void initializeParty() {
		party = new CigarParty();
	}
	
	@Test
	public void failedParty() {
		Assert.assertFalse(party.haveParty(80, false));
		Assert.assertFalse(party.haveParty(30, false));
		Assert.assertFalse(party.haveParty(39, true));
	}
	
	@Test
	public void goodParty() {
		Assert.assertTrue(party.haveParty(50, true));
		Assert.assertTrue(party.haveParty(50, false));
		Assert.assertTrue(party.haveParty(80, true));
	}
}
