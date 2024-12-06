package com.sat_spring_rtc.game.spring.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sat_spring_rtc.game.GameRunner;
import com.sat_spring_rtc.game.GamingConsole;
import com.sat_spring_rtc.game.PacMan;
import com.sat_spring_rtc.game.spring.config.GameConfig;

public class GameController {
public static void main(String[] args)
{
	var context=new AnnotationConfigApplicationContext(GameConfig.class);
	context.getBean(GameRunner.class).run();
}
}
