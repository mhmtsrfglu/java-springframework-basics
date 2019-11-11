/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.application.configuration.AppConfiguration;
import com.application.database.Connector;

public class MainAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Connector connector = applicationContext.getBean(Connector.class);
		connector.connectToDB();
		applicationContext.close();
	}

}
