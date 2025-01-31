package com.karthikeyan.springboot.learn_jdbc_template_with_objects_and_query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class LearnJpaAndHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJpaAndHibernateApplication.class, args);
	}

}

// 3. Mark the class as Repository component
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
	
	public void insertRow() {
		// 2. Execute the query
		jdbcTemplate.update(query, 1, "Hello", "WORLD");
	}	
}

// 5. Mark the class as Component for spring framework to keep track of.
@Component
class CourseCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// 4. Run the auto-wired repository 
		System.out.println("Executing the query ...");
		repo.insertRow();
	}
	
}