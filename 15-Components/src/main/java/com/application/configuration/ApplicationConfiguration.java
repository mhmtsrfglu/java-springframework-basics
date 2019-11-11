/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.application.database.Database;

@Configuration
@ComponentScan(value = "com.application")
public class ApplicationConfiguration {
	
	@Bean
	public Database database() {
		return new Database("localhost","root","123456");
	}
	
}
