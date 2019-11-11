
/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.database;

import java.util.*;

public class Database {

	private String url;
	private String username;
	private String password;
	
	private List<String> props;
	
	@SuppressWarnings("unused")
	private void validate() {
		if(this.url == null || this.username == null || this.password == null) {
			throw new NullPointerException("Değerler boş bırakılamaz");
		}
		else {
			System.out.println("Doğrulama başarılı");
		}
	}
	public Database() {
		
	}

	public Database(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
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

	public List<String> getProps() {
		return props;
	}

	public void setProps(List<String> props) {
		this.props = props;
	}
	
}
