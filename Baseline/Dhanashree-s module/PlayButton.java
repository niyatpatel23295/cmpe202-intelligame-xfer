import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Button	implements Invoker 
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
	/*
	extends */
    /*public void act() 
    {

        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }
        // Add your action code here.
    }

	@Override
	public void setCommand(Command c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invoke() {
		// TODO Auto-generated method stub
		
	}    */
	
private Command PlayCommand;
	public void act(){
		invoke();
	}
	
	public void invoke(){
		if(Greenfoot.mouseClicked(this))
			PlayCommand.execute();
	}
	
	public void setCommand(Command c){
		this.PlayCommand=c;
	}
	
	
	
}
