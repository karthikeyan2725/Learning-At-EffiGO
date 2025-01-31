package com.karthikeyan.springboot.learn_jpa_and_hibernate.copy;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@SpringBootApplication
public class LearnJpaAndHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJpaAndHibernateApplication.class, args);
	}

}

@Entity
class Course {
	@Id
	Long id;
	String name;
	String author;
	
	public Course(Long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public Course() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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

interface SpringJpaRepository extends JpaRepository<Course,Long>{
	List<Course> getByName(String name);
}

@Component
class SpringJpaCommandLineRunner implements CommandLineRunner{
	@Autowired
	SpringJpaRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.save(new Course(1L, "Maven", "K")));
		System.out.println(repo.save(new Course(2L, "Spring", "K")));
		System.out.println(repo.save(new Course(3L, "Github", "K")));

		System.out.println(repo.getByName("Spring"));
	}
}