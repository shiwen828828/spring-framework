package com.shiwen.propertyEditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomPropertyEditorTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("propertyEditor.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
	}
}
