/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.database;

public class Connection {
	
	
	
	public Database database;
	
	public void createConnection() {
		System.out.println("Url : "+this.database.getUrl());
		System.out.println("Username : "+database.getName());
		System.out.println("Password : "+database.getPassword());
		
		System.out.println("Bağlantı kuruldu.");
	}
	
	public void terminateConnection() {
		System.out.println("Bağlantı sonlandırıldı.");
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}
	
}
