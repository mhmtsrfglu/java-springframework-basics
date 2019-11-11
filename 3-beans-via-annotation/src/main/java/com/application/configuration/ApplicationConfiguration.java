/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.application.database.DatabaseConfiguration;


@Configuration
public class ApplicationConfiguration {
	
	@Bean
	public DatabaseConfiguration connectionMethod() {
		
		return new DatabaseConfiguration("mysql:localhost:8080","Mehmet","123456");

	}
	
}
