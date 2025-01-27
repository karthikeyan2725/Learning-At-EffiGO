package com.effigo_spring_learn.learn_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.effigo_spring_learn.learn_spring.game.GameConsole;
import com.effigo_spring_learn.learn_spring.game.GameRunner;
import com.effigo_spring_learn.learn_spring.game.PacManGame;

@Configuration
public class GameContext {
	@Bean
	public GameConsole game() {
		return new PacManGame();
	}
	
	@Bean
	public GameRunner gameRunner() {
		return new GameRunner(game());
	}
}
