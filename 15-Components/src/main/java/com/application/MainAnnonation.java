/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.application.configuration.ApplicationConfiguration;
import com.application.connector.Connector;

public class MainAnnonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		Connector connector = applicationContext.getBean(Connector.class);
		connector.connectToDB();
		connector.getDatabaseInfo();
		applicationContext.close();
		
	}	

}
