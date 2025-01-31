package com.karthikeyan.springboot.REST_API.HELLO_WORLD;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}

}

@RestController
class CourseController{
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourse(){
		return Arrays.asList(
				new Course(1,"ML","in28minutes"),
				new Course(2,"Web Development","in28minutes")
			);	
	}
	
	
}

class Course{
	int id;
	String name;
	String teacher;
	
	public Course(int id, String name, String teacher) {
		super();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTeacher() {
		return teacher;
	}
	
	
}