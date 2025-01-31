package com.springboot.application.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos;
	private static int todosCount = 0;
	
	static { 
		todos = new ArrayList<>();
		todos.add(new Todo(todosCount++,"in28Minutes","learn AWS",
				LocalDate.now().plusYears(1), false));
	}
	
	public List<Todo> findByUsername(String username){
 		return todos;
	}
	
	public void addTodo(String name, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount, name, description, targetDate, done);
		todos.add(todo);
	}
}
