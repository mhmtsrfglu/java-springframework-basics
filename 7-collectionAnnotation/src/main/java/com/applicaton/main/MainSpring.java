/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.applicaton.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.application.database.DatabaseConnection;
import com.applicaton.configuration.ApplicationConfiguration;

public class MainSpring {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		DatabaseConnection databaseConnection = applicationContext.getBean(DatabaseConnection.class);
		databaseConnection.createConnection();
		applicationContext.close();
	}

}
