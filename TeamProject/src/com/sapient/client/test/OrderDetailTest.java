/**
 * 
 */
package com.sapient.client.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.Item;
import com.sapient.client.OrderDetail;

/**
 * @author sshara
 *
 */
public class OrderDetailTest {
	OrderDetail orderDetail = new OrderDetail();
	Item item = new Item();
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		orderDetail.setQuantity(2);
		orderDetail.setItem(item);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sapient.client.OrderDetail#getQuantity()}.
	 */
	@Test
	public final void testGetQuantity() {
		// fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sapient.client.OrderDetail#setQuantity(int)}.
	 */
	@Test
	public final void testSetQuantity() {
		// fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sapient.client.OrderDetail#getTaxStatus()}.
	 */
	@Test
	public final void testGetTaxStatus() {
		// fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sapient.client.OrderDetail#setTaxStatus(int)}.
	 */
	@Test
	public final void testSetTaxStatus() {
		// fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sapient.client.OrderDetail#getOrderDetail()}.
	 */
	@Test
	public final void testGetOrderDetail() {
		// fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.sapient.client.OrderDetail#setOrderDetail(com.sapient.client.Order)}
	 * .
	 */
	@Test
	public final void testSetOrderDetail() {
		// fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sapient.client.OrderDetail#getItem()}.
	 */
	@Test
	public final void testGetItem() {
		// fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.sapient.client.OrderDetail#setItem(com.sapient.client.Item)}.
	 */
	@Test
	public final void testSetItem() {
		// fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sapient.client.OrderDetail#calcSubTotal()}.
	 */
	@Test
	public final void testCalcSubTotal() {
		orderDetail.getItem().setPriceForQuantity(4500.85);
		double actual = orderDetail.calcSubTotal();
		double expected = 9001.7;
		assertEquals(expected, actual, 0.5);
	}

	/**
	 * Test method for {@link com.sapient.client.OrderDetail#calcWeight()}.
	 */
	@Test
	public final void testCalcWeight() {
		orderDetail.getItem().setShippingWeight(20);
		double actual = orderDetail.calcWeight();
		double expected = 39.5;
		assertEquals(expected, actual, 0.5);

	}

}
