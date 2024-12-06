package com.sat_spring_rtc.game;

public class GameRunner {

	
	GamingConsole game;
	public GameRunner(GamingConsole game)
	{
		this.game=game;
	}
	
	public void run()
	{
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
