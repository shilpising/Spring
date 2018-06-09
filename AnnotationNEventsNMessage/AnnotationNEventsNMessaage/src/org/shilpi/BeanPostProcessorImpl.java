package org.shilpi;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		System.out.println("inside BeanPostProcessorImpl before init");
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) {
		System.out.println("inside postProcessorAfterInitialization before init");
		return bean;
	}

}
