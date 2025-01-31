package com.effigo_spring_learn.learn_spring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GameConsole{
	public void down() {
		System.out.println("Mario: Going Down");
	}
	
	public void up() {
		System.out.println("Mario: Going Up");
	}

	public void right() {
		System.out.println("Mario: Going Right");
	}
	
	public void left() {
		System.out.println("Mario: Going Left");
	}
}

