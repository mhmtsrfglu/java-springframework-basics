/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.applicaton.configuration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.application.database.DatabaseConnection;

@Configuration
public class ApplicationConfiguration {

	@Bean
	public DatabaseConnection connectionMethod() {
		DatabaseConnection connection = new DatabaseConnection();

		List<String> list = Arrays.asList("min 3 connection", "max 100 connection");

		Map<String, String> myMap = new HashMap<String, String>();

		myMap.put("min_connection", "3");
		myMap.put("max_connection", "100");

		Properties props = new Properties();
		props.setProperty("user", "root");
		props.setProperty("password", "123456");

		connection.setUrl("mysql:localhost:3606");
		connection.setName("Mehmet");
		connection.setPassword("123456");
		connection.setLists(list);
		connection.setMaps(myMap);
		connection.setProps(props);

		return connection;
	}
	
}
