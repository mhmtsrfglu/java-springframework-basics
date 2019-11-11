/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.applicaton.main;

import com.application.database.DatabaseConnection;
import java.util.*;

public class MainJava {

	public static void main(String[] args) {
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

		connection.createConnection();
	}

}
