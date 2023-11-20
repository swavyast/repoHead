package com.ml.base;

public class AppGamingBasicJava {

    public static void main(String[] args) {
	
	//var marioGame=new MarioGame();
	//var gameRunner=new GameRunner(marioGame);
	
	var contraGame=new ContraGame();
	//gameRunner class is tightly coupled with marioGame, changes required in GameRunner class to run ContraGame.
	//var gameRunner=new GameRunner(contraGame);
	var gameRunner=new GameRunner(contraGame);
	gameRunner.run();

    }

}
