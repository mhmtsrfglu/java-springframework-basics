/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.application.database.Connection;
import com.application.database.Database;
import com.application.database.SessionInfo;

@Configuration
public class ApplicationConfig {

	@Bean(name = "database")
	public Database database() {
		return new Database("mysql:localhost","root","123456");
	}
	
	@Bean(name = "sessionInfo")
	public SessionInfo sessionInfo() {
		return new SessionInfo("Bilgilendirme1","Bilgilendirme2");
	}
	
	@Bean
	public Connection connection() {
		return new Connection();
	}
	
}
