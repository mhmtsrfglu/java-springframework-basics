/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.application.configuration.ApplicationConfiguration;
import com.application.database.Database;

public class MainAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Database database = applicationContext.getBean("database2",Database.class);
		System.out.println(database.getUrl());
		System.out.println(database.getUsername());
		System.out.println(database.getPassword());
		applicationContext.close();
	}	

}
