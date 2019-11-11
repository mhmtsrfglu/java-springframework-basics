/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.configuration;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.application.database.Connector;
import com.application.database.Database;
import com.application.postProcesor.PostProcesor;

@Configuration
public class AppConfiguration {

	@Bean(destroyMethod = "terminateConnection")
	public Connector connectorMethod() {
		
		return new Connector(new Database("localhost", "root", "123456"));

	}
	@Bean
	public BeanPostProcessor postProcesor() {
		return new PostProcesor();
	}

}
