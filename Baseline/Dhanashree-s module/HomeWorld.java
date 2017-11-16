import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.GreenfootSound;
import greenfoot.World;

import java.io.IOException;
import java.util.List; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomeWorld here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class HomeWorld extends World {

	/**
	 * Constructor for objects of class HomeWorld.
	 * 
	 */
	private GreenfootImage img;
	private Title title;
	GreenfootSound music;
	private PlayButton pb;
	private LevelButton lb;
	private QuitButton qb;
	private PlayCommand pc;
	private LevelCommand lc;
	private QuitCommand qc;

	public HomeWorld() {
		// Create a new world with 600x400 cells with a cell size of 1x1 pixels.

		super(800, 600, 1);
		pb = new PlayButton();
		pc = new PlayCommand();
		addObject(pb, 400, 250);

		title = new Title();
		addObject(title, 400, 150);
		img = new GreenfootImage("menubg1.jpg");
		setBackground(img);

		lb = new LevelButton();
		lc = new LevelCommand();

		addObject(lb, 400, 330);

		qb = new QuitButton();
		qc = new QuitCommand();
		addObject(qb, 400, 410);

	//	this.prepare();

	}

	public void prepare() {

		pb.setCommand(pc);
		pc.setReceiver(
				new Receiver()
				{

			public void doAction() {
				if(Greenfoot.mouseClicked(pb)){
					Greenfoot.setWorld(new MyWorld());
				}
			}
		});
		
		lb.setCommand(lc);
		lc.setReceiver(new Receiver(){
			@Override
			public void doAction() {
				if(Greenfoot.mouseClicked(lb)){
					try {
						Greenfoot.setWorld(new LevelWorld());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		
		qb.setCommand(qc);
		qc.setReceiver(new Receiver() {
			
			@Override
			public void doAction() {
				if(Greenfoot.mouseClicked(qb)){
				  Greenfoot.stop();
				}
			}
		});
	}

	// create doaction

}
