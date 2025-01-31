package com.effigo_spring_learn.learn_spring.JakartaCDIApplication;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import jakarta.inject.Named;


class Business{
	Dependency1 dependency1;
	
	public Business(Dependency1 dependency1) {
		this.dependency1 = dependency1;
	}
	
	public String toString() {
		return " Injecting Field: " + dependency1; 
	}
	
}

@Named
class Dependency1{
	public String toString() {
		return getClass().getSimpleName();
	}
}
	

public class DepInjectionLauncherApplication {	
	public static void main(String[] args) {
		try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")){
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			System.out.println("\n" + context.getBean("business"));
		}
	}
}
