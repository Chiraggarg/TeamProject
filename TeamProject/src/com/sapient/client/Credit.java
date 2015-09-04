/**
 * 
 */
package com.sapient.client;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sku266
 *
 */
public class Credit extends Payment implements Authorization {

	public String creditCardNumber;

	Map<String, String> Card = new HashMap<String, String>();

	public void CreditCardType() {
		Card.put("RuPay", "1264");
		Card.put("Maestro", "4652");
		Card.put("MasterCard", "3291");
		Card.put("Visa", "7458");
	}

	private String Cardtype;
	private Date expiryDate;

	public String getNumber() {
		return creditCardNumber;
	}

	public void setNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getType() {
		return Cardtype;
	}

	public void setType(String type) {
		this.Cardtype = type;
	}

	public Date getexpiryDate() {
		return expiryDate;
	}

	public void setexpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public boolean authorizeCardType(String cardType, int creditCardNumber) {
		String cardNumber = Integer.toString(creditCardNumber);

		if (cardNumber.substring(0, 3).equals(Card.get(cardType))) {
			return true;
		}
		return false;
	}

	@Override
	public boolean authorization() {


		if (creditCardNumber.length() != 16) {
			return false;
		}

		Calendar calender = new GregorianCalendar();
		int year = calender.get(Calendar.YEAR);
		int month = calender.get(Calendar.MONTH);
		int date = calender.get(Calendar.DATE);
		@SuppressWarnings("deprecation")
		Date currentDate = new Date(year, month, date);

		if (expiryDate.after(currentDate)) {
			return false;
		}

		return true;

	}

	@Override
	public void authorized() {
		// TODO Auto-generated method stub

	}

}
