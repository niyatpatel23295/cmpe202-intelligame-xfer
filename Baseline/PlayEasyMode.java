import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayEasyMode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayEasyMode extends Button implements Invoker
{
     //private GreenfootSound music;
     private Command command;
    /**
     * Act - do whatever the PlayEasyMode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //PlayEasyMode()
    //{
    //    music = new GreenfootSound("home.wav");
        
    //}
    public void act() 
    {
        // Add your action code here.
        
        invoke();
        
    }    
    
    public void setCommand(Command c){
        this.command = c;
    }
    
    public void invoke(){
        //music.playLoop();
        if(Greenfoot.mouseClicked(this)) 
        {
                command.execute();
                //music.stop();
            }
   
    }
    //public GreenfootSound getMusic()
    //{
    //    return music;
    //}
}



