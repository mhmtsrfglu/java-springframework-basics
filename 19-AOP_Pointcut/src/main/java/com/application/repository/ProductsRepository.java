/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.application.model.Products;

@Component
public class ProductsRepository {
	
	private List<Products> products = new ArrayList<Products>();
	
	
	public void saveProduct(Products product) {
		this.products.add(product);
		System.out.println("Ürün eklendi.");
	}
	
	
	public void deleteProduct(Products products) {
		this.products.remove(products);
		System.out.println("Ürün silindi");
	}
	
	
	public void findProduct(int index) {
		Products products = this.products.get(index);
		System.out.println(products);
	}
	
	public void allProducts() {
		for (Products product : products) {
			System.out.println(product);
		}
	}
}
