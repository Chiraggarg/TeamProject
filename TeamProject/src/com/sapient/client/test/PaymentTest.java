package com.sapient.client.test;

import static org.junit.Assert.*;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.Order;
import com.sapient.client.Payment;

public class PaymentTest {
	Payment payment = new Payment();

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetAmount() {

	}

	@Test
	public final void testSetAmount() {
		double expected = 50.0;
		payment.setAmount(expected);
		double actual = payment.getAmount();
		assertEquals(expected, actual, 0.2);
	}

	@Test
	public final void testGetOrder() {
	}

	@Test
	public final void testSetOrder() {
		Order expected = new Order();
		payment.setOrder(expected);
		Order actual = payment.getOrder();
		assertSame(expected, actual);
	}

}
