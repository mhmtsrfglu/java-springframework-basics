/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application;

import java.util.Locale;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.application.configuration.AppConfig;

public class MainAnnotation {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Locale tr = new Locale("tr","TR");

		String message = applicationContext.getMessage("error.login.message", null, tr);
		System.out.println(message);
		
		applicationContext.close();
	}

}
