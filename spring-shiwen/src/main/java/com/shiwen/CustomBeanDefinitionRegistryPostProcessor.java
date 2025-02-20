package com.shiwen;

import com.shiwen.bean.MyBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;


@Component
public class CustomBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("postProcessBeanDefinitionRegistry start registry mybean");
		// 创建一个新的 BeanDefinition
		BeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setBeanClassName(MyBean.class.getName());
		// 注册 BeanDefinition
		registry.registerBeanDefinition("myBean", beanDefinition);
		System.out.println("postProcessBeanDefinitionRegistry end registry mybean");

	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// 可以在这里对 BeanFactory 进行其他处理
		if (beanFactory.containsBeanDefinition("myBean")) { // 检查 Bean 是否存在
			BeanDefinition myBean = beanFactory.getBeanDefinition("myBean");
			System.out.println("userDefinition message: " + myBean);
		} else {
			System.out.println("Bean 'myBean' not found!");
		}
	}

}
