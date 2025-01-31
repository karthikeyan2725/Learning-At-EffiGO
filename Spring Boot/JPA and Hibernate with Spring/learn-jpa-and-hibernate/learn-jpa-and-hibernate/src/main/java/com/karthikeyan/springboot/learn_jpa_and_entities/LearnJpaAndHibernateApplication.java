package com.karthikeyan.springboot.learn_jpa_and_entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Id;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@SpringBootApplication
public class LearnJpaAndHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJpaAndHibernateApplication.class, args);
	}

}

@Entity
class Course{
	@Id
	int id;
	String name;
	String author;
	
	public Course() {};
	
	public Course(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
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

@Repository
@Transactional
class CourseRepository{
	@PersistenceContext
	private EntityManager entityManager;
	
	void insert(Course course) {
		entityManager.merge(course);
	}
	
	Course get(int id) {
		return entityManager.find(Course.class, id);
	}
	
}

@Component
class CourseCommandLineRunner implements CommandLineRunner{
	@Autowired
	private CourseRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1,"K","P"));
		System.out.println(repository.get(1));
	}
}