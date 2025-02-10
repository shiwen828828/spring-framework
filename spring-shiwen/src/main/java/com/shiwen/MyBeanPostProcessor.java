package com.shiwen;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		System.out.println("MyBeanPostProcessor.postProcessBeforeInitialization()");
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) {
		System.out.println("MyBeanPostProcessor.postProcessAfterInitialization()");
		return bean;
	}
}
