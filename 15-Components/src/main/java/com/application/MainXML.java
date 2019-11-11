/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.application.connector.Connector;

public class MainXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Connector connector = applicationContext.getBean("connector",Connector.class);
		connector.connectToDB();
		connector.getDatabaseInfo();
		applicationContext.close();
	}

}
