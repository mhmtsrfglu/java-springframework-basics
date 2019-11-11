/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Before("pointCutProductRepository()")
	public void beforeLog(JoinPoint joinPoint) {
		System.out.println("Data loglanmaya başladı : " +joinPoint.toString());
	}

	@After("pointCutProductRepository()")
	public void afterLog(JoinPoint joinPoint) {
		System.out.println("Metot Türü : " + joinPoint.getKind());
		System.out.println("Metot imzası : " + joinPoint.getSignature());
		System.out.println("Target class : " + joinPoint.getTarget());
		System.out.println("Args class : " + joinPoint.getArgs());
		System.out.println("----------------------- Data loglanma bitti -------------------------");
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
