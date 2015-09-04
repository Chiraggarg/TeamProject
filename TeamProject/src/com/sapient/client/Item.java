/**
 * 
 */
package com.sapient.client;

/**
 * @author span42
 *
 */
public class Item {

	private double shippingWeight;
	private String description;
	private double priceForQuantity;
	private int weight;

	public double getShippingWeight() {
		return shippingWeight;
	}

	public void setShippingWeight(double shippingWeight) {
		this.shippingWeight = shippingWeight;
	}

	public String getDescripstion() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPriceForQuantity() {

		return priceForQuantity;
	}
	public void setPriceForQuantity(double priceForQuantity) {
		this.priceForQuantity = priceForQuantity;
	}

	public int getWeight() {
		return weight;
	}

}
