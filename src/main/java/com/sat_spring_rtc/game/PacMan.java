package com.sat_spring_rtc.game;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GamingConsole {

	@Override
	public void up() {
		System.out.println("pacman goes up");
	}

	@Override
	public void down() {
		System.out.println("pacman goes down");	
	}

	@Override
	public void left() {
		System.out.println("pacman goes left");
	}

	@Override
	public void right() {
		System.out.println("pacman goes right");
	}

}
