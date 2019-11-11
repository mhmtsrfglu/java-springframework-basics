/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.applicaton.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.application.database.DatabaseConnection;

public class MainSpring {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfiguration.xml");
		
		DatabaseConnection databaseConnection = applicationContext.getBean("databaseConnection",DatabaseConnection.class);
		databaseConnection.createConnection();
	}

}
