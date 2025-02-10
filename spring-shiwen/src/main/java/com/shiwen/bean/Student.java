package com.shiwen.bean;

import javax.annotation.PostConstruct;

public class Student {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@PostConstruct
	public void postConstruct(){
		System.out.println("student postConstruct");
	}

	public void init(){
		System.out.println("student init");
	}
}
