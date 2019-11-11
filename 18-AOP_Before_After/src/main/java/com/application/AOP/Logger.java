/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	
	@Before("execution (public void com.application.repository.ProductsRepository.saveProduct(*))")
	public void beforeLog() {
		System.out.println("Data loglanmaya başladı");
	}
	
	
	
	@After("execution (public void com.application.repository.ProductsRepository.saveProduct(*))")
	public void afterLog() {
		System.out.println("Data loglanma bitti");
	}
	
	//fonksiyon türü farketmeksizin çalışır
	@Before("execution (public * com.application.repository.ProductsRepository.deleteProduct(*))")	
	public void beforeDeleteLog() {
		System.out.println("Data silinmeye başlandı ve loglanmaya başladı");
	}
	
	// fonksiyon türü farketmeksizin ve repository içindeki tüm classlar için çalışır.
	@After("execution (public * com.application.repository.*.deleteProduct(*))")
	public void afterDelete() {
		System.out.println("Data silindi ve log tutuldu");
	}
	
	// * demek tüm proje içerisindeki her hangi bir allProducts fonksiyonu için
	@Before("execution (public * allProducts())")
	public void beforeListLog() {
		System.out.println("Ürünler listelemesi başladı");
	}
	
	// * demek tüm proje içerisindeki her hangi bir allProducts fonksiyonu için çalışır. (..) içinde değer olup olmaksızın farketmez
	@After("execution (public * allProducts(..))")
	public void beforeList2Log() {
		System.out.println("Ürünler listelendi");
	}

}
