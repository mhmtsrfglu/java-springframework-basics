/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.database;

import org.springframework.beans.factory.annotation.Autowired;

public class Connection {

	@Autowired
	private Database database;
	
	@Autowired
	private SessionInfo sessionInfo;
	
	public Connection() {
		
	}

	public Connection(Database database) {
		this.database = database;
	}

	public void createConnection() {
		System.out.println("Url : "+this.database.getUrl());
		System.out.println("Username : "+database.getUsername());
		System.out.println("Password : "+database.getPassword());
		
		System.out.println("Session Infomation : "+ sessionInfo.getInfo1());
		System.out.println("Session Infomation : "+ sessionInfo.getInfo2());
		
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
	
	public SessionInfo getSessionInfo() {
		return sessionInfo;
	}

	public void setSessionInfo(SessionInfo sessionInfo) {
		this.sessionInfo = sessionInfo;
	}
}
