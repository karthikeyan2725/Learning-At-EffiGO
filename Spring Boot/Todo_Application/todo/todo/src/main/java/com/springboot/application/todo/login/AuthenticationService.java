package com.springboot.application.todo.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String name, String password) {
		var isValidName = name.equals("karthi");
		var isValidPassword = password.equals("123");
		
		return isValidName && isValidPassword;
	}
}
