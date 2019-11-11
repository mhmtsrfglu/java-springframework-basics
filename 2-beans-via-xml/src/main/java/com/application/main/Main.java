/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.main;

import com.application.database.DatabaseConfiguration;

public class Main {
	public static void main(String[] args) {
		DatabaseConfiguration config = new DatabaseConfiguration();
		config.setUrl("mysql:localhost:8080");
		config.setUsername("Mehmet");
		config.setPassword("Şifre");
		config.createConnection();
		config.terminateConnection();
	}
}
