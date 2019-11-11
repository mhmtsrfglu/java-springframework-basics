/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.connector;

import org.springframework.beans.factory.annotation.Autowired;

import com.application.database.Database;

public class Connector {
	
	@Autowired
	private Database database;

	public void connectToDB() {
		System.out.println("Bağlantı kuruldu");
	}
	
	public void getDatabaseInfo() {
		System.out.println("URL : " + database.getUrl());
		System.out.println("Username : " + database.getUsername());
		System.out.println("Password : " + database.getPassword());
	}
	
	public void terminateConnection() {
		System.out.println("Connection Terminated!");
	}
	
	
	
}
