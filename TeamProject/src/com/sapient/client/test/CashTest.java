package com.sapient.client.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.Cash;

public class CashTest {
	Cash cash =new Cash();
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetCashTendered() {
		//fail("Not yet implemented");
	}

	@Test
	public final void testSetCashTendered() {
		int expected = 54;
		cash.setCashTendered(expected);
		int actual = cash.getCashTendered();
		assertEquals(expected, actual);
		
	}

}
