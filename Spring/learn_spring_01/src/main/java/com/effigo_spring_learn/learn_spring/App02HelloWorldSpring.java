package com.effigo_spring_learn.learn_spring;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	public static void main(String[] args) {
		// 1: Creating the configuration class
		// 2: Creating the spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldSpringContext.class);
		
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("location"));
		
		System.out.println(context.getBean(Address.class));
		
		System.out.println(context.getBean("person2"));
		
		System.out.println(context.getBean("person3"));
		
		System.out.println("Definition Names:");
		
		Arrays.asList(context.getBeanDefinitionNames()).stream()
		.forEach(System.out::println);;
		
		context.close();
	}
}
