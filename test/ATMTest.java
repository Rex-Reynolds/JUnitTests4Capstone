/**
 * ATMTest.java 1.0 Sep 9, 2014
 *
 * Copyright (c) 2014 Rex A. Reynolds III. All Rights Reserved
 */
package edu.elon.test;

import static org.junit.Assert.*;

import java.text.NumberFormat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author SAUCE
 * @version 1.0
 *
 */
public class ATMTest extends ATM {
	private ATM ATM;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ATM = new ATM(10);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		ATM = null;
	}

	/**
	 * Test method for {@link edu.elon.test.ATM#deposit(double)}.
	 */
	@Test
	public void testDeposit() {
		double amount = 5;
		ATM.deposit(amount);
		double expected = 15;
		double actual = ATM.getBalance();
		assertEquals(expected, actual, 0.5);
	}

	/**
	 * Test method for {@link edu.elon.test.ATM#getBalance()}.
	 */
	@Test
	public void testGetBalance() {
		double expected = 10;
		double actual = ATM.getBalance();
		assertEquals(expected, actual, 0.5);
	}

	/**
	 * Test method for {@link edu.elon.test.ATM#toString()}.
	 */
	@Test
	public void testToString() {
		String expected = "Amount balance is $10.0";

		assertEquals(expected,ATM.toString());
	}

	/**
	 * Test method for {@link edu.elon.test.ATM#withdraw(double)}.
	 */
	@Test
	public void testWithdraw() {
		double amount = 5;
		ATM.withdraw(amount);
		double expected = 5;
		double actual = ATM.getBalance();
		assertEquals(expected, actual, 0.5);
	}

}
