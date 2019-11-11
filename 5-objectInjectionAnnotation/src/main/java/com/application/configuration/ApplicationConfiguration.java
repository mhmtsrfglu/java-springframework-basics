package com.application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.application.database.Connection;
import com.application.database.Database;

@Configuration
public class ApplicationConfiguration {

	@Bean(name="createConnection")
	public Connection createConnectionMethod() {
		Connection connection = new Connection();
		connection.setDatabase(this.databaseMethod());
		return connection;
	}

	@Bean
	public Database databaseMethod() {
		return new Database("mysql:localhost", "Mehmet", "123456");
	}

	@Bean(name="creteConnectionInnerBean")
	public Connection creteConnectionInnerBean() {

		Connection connection = new Connection();
		connection.setDatabase(new Database("mysql:localhost", "Mehmet", "123456"));
		return connection;
	}

}
