package com.sat_spring_rtc;

public class AppGamingBasic {
public static void main(String[] args)
{
	var mario=new MarioGame();
	var superContra=new SuperContra();
	var pacMan=new PacMan();
	var gr=new GameRunner(pacMan);
	gr.run();
}
}
