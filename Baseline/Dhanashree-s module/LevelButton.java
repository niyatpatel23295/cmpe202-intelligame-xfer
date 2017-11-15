import java.io.IOException;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelButton extends Button implements Invoker
{
    /**
     * Act - do whatever the LevelButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
	
	private Command LevelCommand;
	
	public void invoke(){
		if(Greenfoot.mouseClicked(this))
			LevelCommand.execute();
	}
	
	public void setCommand(Command c){
		this.LevelCommand=c;
	}
	
	
   /* public void act() 
    {
    	// Add your action code here.
    	 if (Greenfoot.mouseClicked(this))
         {
    		 try {
				Greenfoot.setWorld(new LevelWorld());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }
        
    }*/    
}
