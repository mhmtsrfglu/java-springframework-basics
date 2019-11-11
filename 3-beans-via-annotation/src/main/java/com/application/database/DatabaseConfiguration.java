/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.database;

public class DatabaseConfiguration {

	private String url;
	private String username;
	private String password;
	
	public DatabaseConfiguration() {
		
	}
	
	public DatabaseConfiguration(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public void createConnection() {
		System.out.println("Url : "+this.url);
		System.out.println("Username : "+this.username);
		System.out.println("Password : "+this.password);
	}
	
	public void terminateConnection() {
		System.out.println("Bağlantı Sonlandırıldı");
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
