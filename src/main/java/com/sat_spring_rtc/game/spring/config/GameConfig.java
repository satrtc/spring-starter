package com.sat_spring_rtc.game.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.sat_spring_rtc.game.GameRunner;
import com.sat_spring_rtc.game.GamingConsole;
import com.sat_spring_rtc.game.MarioGame;
import com.sat_spring_rtc.game.PacMan;
import com.sat_spring_rtc.game.SuperContra;

@Configuration
public class GameConfig {


@Bean
public GamingConsole game()
{
	var game=new PacMan();
	return game;
}

@Bean
public GameRunner gamerunner()
{
	var gamerunner=new GameRunner(game());
	return gamerunner;
}
}



