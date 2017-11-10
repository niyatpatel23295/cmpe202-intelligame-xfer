import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * If player out of health (health = 0)
 * HealthScreen calls this class to create a new World
 * Diaplays "Game over message"
 * It gives various buttons to move forward
 * 
 * @author Ambika Bohra 
 * @version 1(10/31/2017)
 */
public class GameOverState extends World
{
	//constructor
	public GameOverState()
	{    
		super(800, 600, 1); 
		(new GreenfootSound("game-over.wav")).play();
		GreenfootImage im = new GreenfootImage("menubg1.jpg");
		setBackground(im);
		addObject(new GameOver(), 400, 300);
		addObject(new TryAgain(), 450, 250);
		addObject(new BacktoMenu(), 450, 320);
		addObject(new QuitButton(), 450, 390);
	}

	public void act() {}
}
