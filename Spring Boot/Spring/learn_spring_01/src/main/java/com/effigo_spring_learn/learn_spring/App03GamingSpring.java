package com.effigo_spring_learn.learn_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.effigo_spring_learn.learn_spring.game.GameRunner;

public class App03GamingSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context = new AnnotationConfigApplicationContext(GameContext.class)){
			context.getBean(GameRunner.class).run();
		}
	}

}
