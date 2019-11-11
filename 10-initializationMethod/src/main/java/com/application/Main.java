
/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.application.database.Connection;

public class Main {
	public static void main(String[] args) {
		
		

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Connection connection = applicationContext.getBean("connection",Connection.class);
		
		connection.createConnection();
		connection.terminateConnection();
	
		
		applicationContext.close();
		
	}
}
