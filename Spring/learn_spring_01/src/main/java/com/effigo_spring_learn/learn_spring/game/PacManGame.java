package com.effigo_spring_learn.learn_spring.game;

public class PacManGame implements GameConsole{
	public void down() {
		System.out.println("PacMan: Going Down");
	}
	
	public void up() {
		System.out.println("PacMan: Going Up");
	}

	public void right() {
		System.out.println("PacMan: Going Right");
	}
	
	public void left() {
		System.out.println("PacMan: Going Left");
	}
}
