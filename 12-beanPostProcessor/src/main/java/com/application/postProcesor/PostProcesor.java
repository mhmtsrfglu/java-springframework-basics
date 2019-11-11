/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.postProcesor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.application.database.Connector;
import com.application.database.Database;

public class PostProcesor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Bean oluşturulmadan önce : " + beanName);

		if (bean instanceof Connector) {
			System.out.println("bu Bean " + beanName + " Connector türünde");
		} else if (bean instanceof Database) {
			System.out.println("bu Bean " + beanName + " Database türünde");
		}

		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub

		System.out.println("Bean oluşturulmadan sonra : " + beanName);

		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
