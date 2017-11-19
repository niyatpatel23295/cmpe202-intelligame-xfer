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
         this.prepare();
        System.out.println("HomeWorld initialized");
       
        
    }
    
    public void prepare()
    {
        //        GameStart gamestart2 = new GameStart(new Start());
        //        addObject(gamestart2, 106, 350);
        PlayDifficultMode pdm = new PlayDifficultMode();
        addObject(pdm, 400, 330);
        
        PlayEasyMode pem = new PlayEasyMode();
        addObject(pem, 400, 250);
        
        ExitButton eb = new ExitButton();
        addObject(eb, 400, 410); //stops game
        
        Command commandSlow = new ConcreteCommand();
        Command commandFast = new ConcreteCommand();
        Command commandExit = new ConcreteCommand();
        
        commandSlow.setReceiver(new ReceiverSlow());
        commandFast.setReceiver(new ReceiverFast());
        commandExit.setReceiver(new ReceiverExit());
        
        pdm.setCommand(commandFast);
        pem.setCommand(commandSlow);
        eb.setCommand(commandExit);
        
    }
}
