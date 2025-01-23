package com.effigo_spring_learn.learn_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.effigo_spring_learn.learn_spring.game.GameRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.effigo_spring_learn.learn_spring.game.GameConsole;
import com.effigo_spring_learn.learn_spring.game.GameRunner;
import com.effigo_spring_learn.learn_spring.game.PacManGame;

@Configuration
public class App03GamingSpring {
	@Bean
	public GameConsole game() {
		return new PacManGame();
	}
	
	@Bean
	public GameRunner gameRunner() {
		return new GameRunner(game());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context = new AnnotationConfigApplicationContext(App03GamingSpring.class)){
			context.getBean(GameRunner.class).run();
		}
	}
}
