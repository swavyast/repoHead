package com.ml.base;

public class GameRunner {
    
    private MarioGame game;
    private ContraGame contra;
    
    public GameRunner(ContraGame contraGame) {
	this.contra=contraGame;
    }
    
    public GameRunner(MarioGame marioGame) {
	this.game=marioGame;
    }

    public void run() {
	
	//System.out.println("Running game : "+game);
	System.out.println("Running game : "+contra);
	/**
	game.up();
	game.down();
	game.left();
	game.right();
	*/
	contra.up();
	contra.down();
	contra.left();
	contra.right();
	
    }

}
