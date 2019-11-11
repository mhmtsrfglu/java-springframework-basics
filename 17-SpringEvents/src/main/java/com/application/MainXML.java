/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.application.publisher.UserEventPublisher;

public class MainXML {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext.xml");
		
		UserEventPublisher eventPublisher = applicationContext.getBean("userEventPublisher",UserEventPublisher.class);
		eventPublisher.userRegister();
		applicationContext.close();

	}

}
