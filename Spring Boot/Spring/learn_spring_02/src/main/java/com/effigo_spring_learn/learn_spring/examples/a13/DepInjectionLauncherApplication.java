package com.effigo_spring_learn.learn_spring.examples.a13;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Business{
	Dependency1 dependency1;
	Dependency2 dependency2;
	
	public String toString() {
		return " Injecting Constructors: " + dependency1 + " and " + dependency2; 
	}

	@Autowired
	public Business(Dependency1 dependency1, Dependency2 dependency2) {
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
}

@Component
class Dependency1{
	public String toString() {
		return getClass().getSimpleName();
	}
}

@Component
class Dependency2{
	public String toString() {
		return getClass().getSimpleName();
	}
}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			System.out.println("\n" + context.getBean("business"));
		}
	}
}
