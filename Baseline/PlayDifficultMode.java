import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayDifficultMode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayDifficultMode extends Button implements Invoker
{
    private Command command;
    //private GreenfootSound music;
    PlayDifficultMode()
    {
        //music = new GreenfootSound("home.wav");
        
    }
    /**
     * Act - do whatever the PlayDifficultMode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
            invoke();
        
    }  
    
 
    public void setCommand(Command c){
        this.command = c;
    }
    
    public void invoke(){
        if(Greenfoot.mouseClicked(this)) {
        this.command.execute();
        //music.stop();
    }
       
    }
}
