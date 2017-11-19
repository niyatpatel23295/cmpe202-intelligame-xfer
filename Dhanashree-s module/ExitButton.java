import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ExitButton extends Button
{
    //GameManager gm = GameManager.getInstance();
    
     private Command command;
    /**
     * Act - do whatever the ExitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)) {
            invoke();
        }
    }  
    
 
    public void setCommand(Command c){
        this.command = c;
    }
    
    public void invoke(){
        this.command.execute();
    }
	  
}





  