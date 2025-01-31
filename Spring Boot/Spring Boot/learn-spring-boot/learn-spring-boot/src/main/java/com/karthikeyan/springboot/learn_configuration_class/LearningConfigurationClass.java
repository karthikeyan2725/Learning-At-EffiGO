package com.karthikeyan.springboot.learn_configuration_class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearningConfigurationClass {

	public static void main(String[] args) {
//		SpringApplication.run(LearningConfigurationClass.class, args);
	}

}

@RestController
class ExampleServiceController {
	@Autowired
	ExampleConfiguration exampleConfiguration;
	
	@RequestMapping("/example")
	public ExampleConfiguration getConfiguration() {
		return exampleConfiguration;
	}
	
}

@ConfigurationProperties(prefix = "example.config")
class ExampleConfiguration{
	private int number;
	private String text;
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String setText(String text) {
		return this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	public String toString() {
		return "";
	}
}