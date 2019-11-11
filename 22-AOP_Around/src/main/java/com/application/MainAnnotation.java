/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.application.configuration.AppConfig;
import com.application.model.Products;
import com.application.repository.ProductsRepository;

public class MainAnnotation {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductsRepository productsRepository = applicationContext.getBean(ProductsRepository.class);

		Products product = new Products("Elma", 2.25, 250, "Meyve");

		productsRepository.saveProduct(product);
		System.out.println(productsRepository.findProduct(0));
		

		applicationContext.close();
	}

}
