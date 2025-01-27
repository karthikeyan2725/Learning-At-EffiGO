package com.effigo_spring_learn.learn_spring.PrePostAnnotationLauncherApplication;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass{
	
}

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{
	
}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)){
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			System.out.println(context.getBean("normalClass"));
			System.out.println(context.getBean("normalClass"));
			System.out.println(context.getBean("normalClass"));
			System.out.println(context.getBean("normalClass"));
			System.out.println(context.getBean("normalClass"));
			
			System.out.println(context.getBean("prototypeClass"));
			System.out.println(context.getBean("prototypeClass"));
			System.out.println(context.getBean("prototypeClass"));
			System.out.println(context.getBean("prototypeClass"));
			System.out.println(context.getBean("prototypeClass"));
		}
	}
}
