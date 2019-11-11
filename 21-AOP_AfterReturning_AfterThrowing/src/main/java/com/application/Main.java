/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.application.model.Products;
import com.application.repository.ProductsRepository;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext.xml");
		
		ProductsRepository productsRepository = applicationContext.getBean("productsRepository",ProductsRepository.class);
		
		Products product = new Products("Elma",2.25,250,"Meyve");
		
		productsRepository.saveProduct(product);
		productsRepository.allProducts();
		applicationContext.close();
	}

}
