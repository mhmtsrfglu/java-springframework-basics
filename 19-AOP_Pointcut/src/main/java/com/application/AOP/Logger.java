/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Before("pointCutProductRepository()")
	public void beforeLog() {
		System.out.println("Data loglanmaya başladı");
	}

	@After("pointCutProductRepository()")
	public void afterLog() {
		System.out.println("Data loglanma bitti");
	}

	@Pointcut("execution (public void com.application.repository.ProductsRepository.saveProduct(*))")
	public void beforeLogPointCut() {
	}

	@Pointcut("execution (public void com.application.repository.ProductsRepository.saveProduct(*))")
	public void afterLogPointCut() {
	}

	// bu repository içindeki tüm fonksiyonlar için çalış
	@Pointcut("within (com.application.repository.ProductsRepository)")
	public void pointCutProductRepository() {
	}

	/* Tüm classlar için geçerli
	 * within (com.application..*)
	 * 
	 * */
}
