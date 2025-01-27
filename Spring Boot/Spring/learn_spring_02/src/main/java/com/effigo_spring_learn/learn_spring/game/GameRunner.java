package com.effigo_spring_learn.learn_spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private GameConsole game;

	public GameRunner(@Qualifier("GameConsoleQualifier") GameConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("The Game is running " + game.getClass().getSimpleName());
	}
	
}
