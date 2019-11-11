/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class Logger {

	@Around("@annotation(com.application.annotations.SpecialAnnotation)")
	public void markedAnnotations(ProceedingJoinPoint joinPoint) {

		try {
			System.out.println("Özel anatasyon ile Başladı : "+joinPoint);
			joinPoint.proceed();
		}catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("Özel anatasyon ile bitti : "+joinPoint);
		}
	}
}
