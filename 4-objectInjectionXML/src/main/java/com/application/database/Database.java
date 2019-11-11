/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.database;

public class Database {

	private String url;
	private String name;
	private String password;
	
	public Database() {
		
	}
	
	public Database(String url, String name, String password) {
		super();
		this.url = url;
		this.name = name;
		this.password = password;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	
	
}
