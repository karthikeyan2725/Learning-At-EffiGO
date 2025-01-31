package com.effigo_spring_learn.learn_spring.BeanScopesLauncherApplication;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class ClassA{
	
}

@Component
class ClassB{
	ClassA a;
	
	public ClassB(ClassA a) {
		this.a = a;
		System.out.println("Class B Created");
	}
	
	@PostConstruct
	public void Initialize() {
		System.out.println("Initialization for Class B");
	}
	
	@PreDestroy
	public void Deallocate() {
		System.out.println("Deallocation for Class B");
	}
}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)){
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
		
		}
	}
}
