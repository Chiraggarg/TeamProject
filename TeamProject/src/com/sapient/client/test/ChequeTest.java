package com.sapient.client.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.Cheque;

public class ChequeTest {
	public Map<String, String> bankDetails = new HashMap<String, String>();

	Cheque check = new Cheque();

	@Before
	public void setUp() throws Exception {

		bankDetails.put("SBI Bank", "SBIN0000686");
		bankDetails.put("ICICI Bank", "ICICI0003709");

	}

	@After
	public void tearDown() throws Exception {
		bankDetails = null;
	}

	@Test
	public void getSetNametest() {
		String expected = "SBI Bank";
		String actual = null;
		check = new Cheque();
		check.setName("SBI Bank");
		actual = check.getName();
		assertEquals(expected, actual);
	}

	@Test
	public void getSetBankIdtest() {
		String expected = "SBIN0000686";
		String actual = null;
		check = new Cheque();
		check.setBankID("SBIN0000686");
		actual = check.getBankID();
		assertEquals(expected, actual);
	}

	@Test
	public void authorizedTest() {
		boolean actual = false;
		check.setBankID("SBIN0000686");
		check.setName("SBI Bank");
		Iterator<Map.Entry<String, String>> iterator = bankDetails.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			String key = entry.getKey();
			String checkName = check.getName();
			String entryValue = entry.getValue();
			String checkBankID = check.getBankID();
			if (key == checkName && entryValue == checkBankID) {
				actual = check.authorization();
			}

		}

		assertTrue(actual);

	}
}
