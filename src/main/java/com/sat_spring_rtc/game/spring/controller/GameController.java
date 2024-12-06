package com.sat_spring_rtc.game.spring.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import com.sat_spring_rtc.game.GameRunner;
import com.sat_spring_rtc.game.GamingConsole;
import com.sat_spring_rtc.game.PacMan;

@Configuration
@ComponentScan("com.sat_spring_rtc.game")
public class GameController {

public static void main(String[] args)
{
	var context=new AnnotationConfigApplicationContext(GameController.class);
	context.getBean(GameRunner.class).run();
}
}
