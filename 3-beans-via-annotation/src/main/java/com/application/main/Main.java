/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.application.configuration.ApplicationConfiguration;
import com.application.database.DatabaseConfiguration;

public class Main {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext cax = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
	
		DatabaseConfiguration db = cax.getBean(DatabaseConfiguration.class);
		
		db.createConnection();
		db.terminateConnection();
		cax.close();
	}
}
