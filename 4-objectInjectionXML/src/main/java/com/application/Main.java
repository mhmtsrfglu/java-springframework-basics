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
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
		
		
		Connection con = applicationContext.getBean("dbConnection",Connection.class);
		
		con.createConnection();
		con.terminateConnection();
		
		
		applicationContext.close();
	}
}
