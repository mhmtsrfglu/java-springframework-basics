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
		
		if(products == null)
			throw new NullPointerException("Ürün boş");
		
		this.products.remove(products);
		System.out.println("Ürün silindi");
	}
	
	
	public Products findProduct(int index) {
		
		if(index <0)
			throw new IllegalArgumentException("Index 0 dan küçük olamaz");
		
		Products product = this.products.get(index);
		System.out.println(product);
		return product;
	}
	
	public void allProducts() {
		for (Products product : products) {
			System.out.println(product);
		}
	}
}
