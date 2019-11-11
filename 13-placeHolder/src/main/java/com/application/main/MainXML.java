/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.application.database.Database;

public class MainXML {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Database database = applicationContext.getBean("database",Database.class);
		System.out.println(database.getUrl());
		System.out.println(database.getUsername());
		System.out.println(database.getPassword());
		applicationContext.close();
	}
}
