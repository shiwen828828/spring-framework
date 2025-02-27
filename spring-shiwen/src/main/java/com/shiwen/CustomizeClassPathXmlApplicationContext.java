package com.shiwen;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomizeClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	String configLocation;

	public CustomizeClassPathXmlApplicationContext(String configLocation) {
		super(configLocation);
	}
	@Override
	protected void initPropertySources() {
		System.out.println("扩展initPropertySources");
		getEnvironment().setRequiredProperties("user.name");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		// super 和 beanFactory 设置的属性是不一样的 super 是为applicationcontext 的设置的 beanFactory 是为DefaultListableBeanFactory设置的
		beanFactory.setAllowBeanDefinitionOverriding(true);
		beanFactory.setAllowCircularReferences(true);

		super.setAllowBeanDefinitionOverriding(true);
		super.setAllowCircularReferences(true);
		super.customizeBeanFactory(beanFactory);
	}
}
