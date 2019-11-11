/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application;

import java.util.Locale;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext.xml");
		
		Locale tr = new Locale("tr","TR");
		
		String message = applicationContext.getMessage("error.login.message", null, tr);
		System.out.println(message);
		applicationContext.close();
	}

}
