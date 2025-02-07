package com.shiwen;

import com.shiwen.bean.User;
import com.shiwen.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoationTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		User bean = annotationConfigApplicationContext.getBean(User.class);
		System.out.println(bean);
	}
}