/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.model;


public class Products {

	private String name;
	private Double price;
	private int avaible;
	private String category;

	public Products() {

	}

	public Products(String name, Double price, int avaible, String category) {
		this.name = name;
		this.price = price;
		this.avaible = avaible;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getAvaible() {
		return avaible;
	}

	public void setAvaible(int avaible) {
		this.avaible = avaible;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Products [name=" + name + ", price=" + price + ", avaible=" + avaible + ", category=" + category + "]";
	}
	
	

	
}
