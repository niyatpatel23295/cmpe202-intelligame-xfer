import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * GUI (home screen)
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomeWorld extends World
{
	private GreenfootImage img;
	private Title title;

	public HomeWorld()
	{    
		super(800, 600, 1); 

		title = new Title();
		addObject(title, 400, 150);

		img = new GreenfootImage("menubg1.jpg");
		setBackground(img);

		addObject(new PlayButton(), 400, 250); //takes to play screen
		addObject(new LevelButton(), 400, 330); //takes to levels screen
		addObject(new QuitButton(), 400, 410); //stops game
		addObject(new ScoreButton(), 250, 550); // score board
		addObject(new ShareFriends(),400, 550); //sharing options
		addObject(new Help(), 550, 550); //info page for various key operations
	}
}
