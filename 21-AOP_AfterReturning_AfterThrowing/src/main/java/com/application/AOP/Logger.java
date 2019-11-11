/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.application.model.Products;

@Aspect
@Component
public class Logger {

	@AfterReturning(pointcut = "execution (public * com.application.repository.*.findProduct(*))", returning = "product")
	public void afterReturning(JoinPoint joinPoint, Products product) {
		System.out.println("Metot return ettikten sonra başladım : " + joinPoint);
		System.out.println("Return eden değer : " + product);
	}

	@AfterThrowing(pointcut = "within (com.application.repository.ProductsRepository)", throwing = "error")
	public void afterThrowAnError(JoinPoint joinPoint, RuntimeException error) {
		System.out.println("Fonksiyon hata verdi : " + joinPoint);
		System.out.println("Hata : " + error);
	}

}
