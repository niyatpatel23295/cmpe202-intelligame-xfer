import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * if one level is completed, calls new screen
 * displays score of the level completed
 * 
 * @author Ambika Bohra
 * @version 10/31/2017
 */

public class LevelCompletedState extends World
{
	//Constructor with reference to score from previous level
	public LevelCompletedState(ScoreScreen score)
	{    
		super(800, 600, 1); 
		GreenfootImage im = new GreenfootImage("background1.png");
		setBackground(im);
		addObject(new Level(), 400, 300);
		addObject(score, 430, 260);
		addObject(((ScoreScreen)getObjects(ScoreScreen.class).get(0)), 430, 260);
		addObject(new NextLevel(), 380, 350);
		addObject(new QuitButton(), 380, 420);
	}
	
	public void act() {}
}
