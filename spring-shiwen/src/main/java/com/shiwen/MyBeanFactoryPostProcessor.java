package com.shiwen;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyBeanFactoryPostProcessor implements  BeanFactoryPostProcessor, PriorityOrdered {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		if (beanFactory.containsBeanDefinition("user")) { // 检查 Bean 是否存在
			BeanDefinition user = beanFactory.getBeanDefinition("user");
			System.out.println("userDefinition message: " + user);
		} else {
			System.out.println("Bean 'user' not found!");
		}
	}

	@PostConstruct
	public void init(){
		System.out.println("MyBeanFactooryPostProcessor init method");
	}

	@Override
	public int getOrder() {
		return Ordered.HIGHEST_PRECEDENCE;
	}
}
