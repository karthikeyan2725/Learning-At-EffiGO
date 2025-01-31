package com.effigo_spring_learn.learn_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};
record Address(String stree, String city) {};

@Configuration
public class HelloWorldSpringContext {
	@Bean
	public String name() {
		return "Karthikeyan";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("Karthik", 20);
	}
	
	@Bean(name="location")
	public Address address2(){
		return new Address("Baker Street", "London");
	}
	
	@Bean(name="location")
	public Address address(){
		return new Address("Baker Street", "London");
	}
	
	@Bean
	public Person person2(){
		return new Person(name(), age());
	}
	
	@Bean
	public Person person3(String name, int age) {
		return new Person(name, age);
	}
}
