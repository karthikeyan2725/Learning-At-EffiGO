package com.effigo_spring_learn.learn_spring.game;

public class SuperContraGame implements GameConsole{
	public void down() {
		System.out.println("SuperContra: Going Down");
	}
	
	public void up() {
		System.out.println("SuperContra: Going Up");
	}

	public void right() {
		System.out.println("SuperContra: Going Right");
	}
	
	public void left() {
		System.out.println("SuperContra: Going Left");
	}
}
