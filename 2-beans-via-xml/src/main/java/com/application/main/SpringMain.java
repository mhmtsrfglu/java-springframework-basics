/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.application.database.DatabaseConfiguration;

public class SpringMain {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// id ile bean çağırma
		DatabaseConfiguration dbconfig = configurableApplicationContext.getBean("databaseConnectionIndex",
				DatabaseConfiguration.class);
		// alias ile bean çağırma
		//DatabaseConfiguration dbconfig = configurableApplicationContext.getBean("dbBaglan",DatabaseConfiguration.class);

		dbconfig.createConnection();
		dbconfig.terminateConnection();

		configurableApplicationContext.close();

	}

}
