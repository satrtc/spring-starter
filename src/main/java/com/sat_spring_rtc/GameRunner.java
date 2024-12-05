package com.sat_spring_rtc;

public class GameRunner {

	GamingConsole gameConsole;
	public GameRunner(GamingConsole gameConsole) {
		this.gameConsole=gameConsole;
	}
	public void run() {
		
		System.out.println("Game is running");
		gameConsole.up();
		gameConsole.down();
		gameConsole.left();
		gameConsole.right();
	}

	

}
