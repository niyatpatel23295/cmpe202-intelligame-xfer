import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * if one level is completed, calls new screen
 * displays score of the level completed
 * 
 * @author Ambika Bohra
 * @version 10/31/2017
 */

public class LevelCompletedWorld extends World
{
	//Constructor with reference to score from previous level
	public LevelCompletedWorld(ScoreScreen score)
	{    
		super(800, 600, 1); 
		GreenfootImage im = new GreenfootImage("background1.png");
		setBackground(im);
		addObject(new Level(), 400, 300);
		addObject(score, 430, 260);
		addObject(((ScoreScreen)getObjects(ScoreScreen.class).get(0)), 430, 260);
		addObject(new TryAgain(), 380, 350);
		addObject(new QuitButton(), 380, 420);
	}
	
	public void act() {}
}
