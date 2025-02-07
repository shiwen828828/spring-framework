package com.shiwen;

import com.shiwen.bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
		User bean = classPathXmlApplicationContext.getBean(User.class);
		System.out.println(bean);

	}
}
