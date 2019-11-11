/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Around(value = "pointCut()")
	public void around(ProceedingJoinPoint joinPoint) {
		
		
		try {
			System.out.println("Around Başladı : "+joinPoint);
			joinPoint.proceed();
		}catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("Around bitti : "+joinPoint);
		}
	}
	
	@Pointcut("within (com.application.repository.*)")
	public void pointCut() {}

}
