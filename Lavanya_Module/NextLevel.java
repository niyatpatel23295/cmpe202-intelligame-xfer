import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevel extends Button
{
	
    /**
     * Act - do whatever the NextLevel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
    	if (Greenfoot.mouseClicked(this)){
    		LevelSingleton levelSingleton = LevelSingleton.getInstance();
    		int value = levelSingleton.incrementLevel();
    		
    		switch(value){
	    		case 1: Greenfoot.setWorld(new MyWorld());
	    			break;
	    		case 2: Greenfoot.setWorld(new Level2World());
	    			break;
	    		case 3: Greenfoot.setWorld(new Level3World());
	    			break;
	    		default: Greenfoot.setWorld(new LevelWorld());
	    			break;
    		}	
        }
    }    
}
