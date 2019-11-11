/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.database;

public class Connector {
	
	private Database database;

	
	public Connector(Database database) {
		this.database = database;
	}


	public void connectToDB() {
		System.out.println("URL : " + database.getUrl());
		System.out.println("Username : " + database.getUsername());
		System.out.println("Password : " + database.getPassword());
	}
	
	
	public void terminateConnection() {
		System.out.println("Connection Terminated!");
	}
	
	
	
}
