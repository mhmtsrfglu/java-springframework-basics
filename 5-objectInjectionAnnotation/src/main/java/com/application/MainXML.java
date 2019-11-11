/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application;

import com.application.database.Connection;
import com.application.database.Database;

public class MainXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = new Connection();
		connection.setDatabase(new Database("mysql:localhost", "Mehmet", "123456"));
		connection.createConnection();
		connection.terminateConnection();
	}

}
