/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

import com.application.database.Database;

@Configuration
@PropertySources({
	@PropertySource(value = "db.properties", encoding = "UTF-8")
})
public class ApplicationConfiguration {

	@Value("${url}")
	private String url;
	@Value("${name}")
	private String name;
	@Value("${password}")
	private String password;
	
	@Autowired
	private Environment env;
	
	
	@Bean(name="database")
	public Database database() {
		return new Database(url, name, password);
	}
	
	
	@Bean(name="database2")
	public Database database2() {
		
		String url1 = this.env.getProperty("url");
		String name1 = this.env.getProperty("name");
		String password1 = this.env.getProperty("password");
		
		return new Database(url1,name1,password1);
	}
	
	
}
