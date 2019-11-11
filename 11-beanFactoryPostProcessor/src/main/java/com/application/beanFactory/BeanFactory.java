/**
 * @author mehmet_serefoglu
 * @github https://github.com/mhmtsrfglu
 */
package com.application.beanFactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactory implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("applicatonContext.xml dosyası yüklendi");
		System.out.println("Var olan bean sayısı : "+beanFactory.getBeanDefinitionCount());
		System.out.println("-----------------------------------------------------------------------");

	}

}
