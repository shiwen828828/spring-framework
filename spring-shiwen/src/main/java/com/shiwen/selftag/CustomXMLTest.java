package com.shiwen.selftag;

import com.shiwen.bean.CustomUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomXMLTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("customapplication.xml");
		CustomUser customUser = (CustomUser) context.getBean("testbean");
		System.out.println("username:" + customUser.getUserName() + "  " + "email:" + customUser.getEmail());
	}
}
