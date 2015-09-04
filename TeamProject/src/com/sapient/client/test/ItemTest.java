/**
 * 
 */
package com.sapient.client.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author sshara
 *
 */
public class ItemTest {

	Map<String, List<String>> itemList = new HashMap<String, List<String>>();
	List<String> valSetOne = new ArrayList<String>();
	List<String> valSetFive = new ArrayList<String>();
	List<String> valSetFour = new ArrayList<String>();
	List<String> valSetThree = new ArrayList<String>();
	List<String> valSetTwo = new ArrayList<String>();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		valSetOne.add("20");
		valSetOne.add("1000");
		valSetOne.add("LOGITECH LASER GAMING MOUSE LTECH0D45");
		valSetTwo.add("250");
		valSetTwo.add("2000");
		valSetTwo.add("HP Keyboard Model No :- 0D456");
		valSetThree.add("750");
		valSetThree.add("4000");
		valSetThree.add("WD Elements USB 3.0/2.0 Compatible");
		valSetFour.add("50");
		valSetFour.add("400");
		valSetFour.add("Kingston 3.0");
		valSetFive.add("1500");
		valSetFive.add("7000");
		valSetFive.add("Lenovo TFT 18\" ");
		itemList.put("Mouse", valSetOne);
		itemList.put("Keyboard", valSetTwo);
		itemList.put("HardDisk", valSetThree);
		itemList.put("Pen Drive", valSetFour);
		itemList.put("Monitor", valSetFive);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		itemList = null;
	}

	/**
	 * Test method for {@link com.sapient.client.Item#getShippingWeight()}.
	 */
	@Test
	public final void testGetShippingWeight() {
		// fail("Not yet implemented");
		
	}

	/**
	 * Test method for {@link com.sapient.client.Item#setShippingWeight(int)}.
	 */
	@Test
	public final void testSetShippingWeight() {
		// fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sapient.client.Item#getDescription()}.
	 */
	@Test
	public final void testGetDescription() {
		String key = "Mouse";
		if (itemList.containsKey(key)) {
			String actualResult = itemList.get(key).get(2).toUpperCase();
			assertEquals("LOGITECH LASER GAMING MOUSE LTECH0D45", actualResult);
		}
		String key2 = null;
		if (itemList.containsKey(key2)) {
			String actualResult = itemList.get(key2).get(2);
			assertEquals("2000", actualResult);
		}
	}

	/**
	 * Test method for
	 * {@link com.sapient.client.Item#setDescription(java.lang.String)}.
	 */
	@Test
	public final void testSetDescription() {
		// fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sapient.client.Item#getPriceForQuantity()}.
	 */
	@Test
	public final void testGetPriceForQuantity() {
		String key = "Mouse";
		if (itemList.containsKey(key)) {
			String actualResult = itemList.get(key).get(1);
			assertEquals("1000", actualResult);
		}
		
		String key2 = null;
		if (itemList.containsKey(key2)) {
			String actualResult = itemList.get(key2).get(1);
			assertEquals("2000", actualResult);
		}
	}

	/**
	 * Test method for {@link com.sapient.client.Item#getWeight()}.
	 */
	@Test
	public final void testGetWeight() {
		String key = "Mouse";
		if (itemList.containsKey(key)) {
			String actualResult = itemList.get(key).get(0);
			assertEquals("20", actualResult);
		}
		String key2 = null;
		if (itemList.containsKey(key2)) {
			String actualResult = itemList.get(key2).get(0);
			assertEquals("2000", actualResult);
		}
	}

}
