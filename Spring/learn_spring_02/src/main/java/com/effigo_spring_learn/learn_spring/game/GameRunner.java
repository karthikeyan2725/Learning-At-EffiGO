package com.effigo_spring_learn.learn_spring.game;

public class GameRunner {
	private GameConsole game;

	public GameRunner(GameConsole game) {
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The Game is running " + game);
	}
	
}
