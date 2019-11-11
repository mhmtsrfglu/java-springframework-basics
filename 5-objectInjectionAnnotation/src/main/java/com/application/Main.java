/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.application.configuration.ApplicationConfiguration;
import com.application.database.Connection;

public class Main {
	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ApplicationConfiguration.class);

		Connection con = applicationContext.getBean("creteConnectionInnerBean", Connection.class);

		con.createConnection();
		con.terminateConnection();

		Connection con2 = applicationContext.getBean("createConnection",Connection.class);

		con2.createConnection();
		con2.terminateConnection();
		applicationContext.close();
	}
}
