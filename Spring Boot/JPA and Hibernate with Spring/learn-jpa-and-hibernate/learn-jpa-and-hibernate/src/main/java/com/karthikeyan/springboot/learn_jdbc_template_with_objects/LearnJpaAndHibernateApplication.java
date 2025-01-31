package com.karthikeyan.springboot.learn_jdbc_template_with_objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class LearnJpaAndHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJpaAndHibernateApplication.class, args);
	}

}

@Repository
class CourseRepository { 
	
	// 1. Create a JDBC template object
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String query = 
			"""
			INSERT INTO COURSE
			VALUES (?, ?, ?);
			""";
	
	private static String SELECT_QUERY = 
			"""
			SELECT * FROM COURSE
			WHERE id = 1;
			""";
	
	public void insertRow() {
		jdbcTemplate.update(query, 1, "Hello", "WORLD");
	}	
	
	public Course selectCourse() {
		return jdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class));
	}
}

class Course{
	int id;
	String name;
	String author;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
}

@Component
class CourseCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Executing the query ...");
		repo.insertRow();
		Course selectedCourse = repo.selectCourse();
		System.out.println(selectedCourse);
	}
	
}