import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List;

/**
 * Write a description of class LevelWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelWorld extends World
{

    /**
     * Constructor for objects of class LevelWorld.
     * 
     */
    private GreenfootImage img;
    private Title title;
    GreenfootSound music; 
    
    public LevelWorld()
    {  
        super(800, 600, 1);
        
        title = new Title();
        addObject(title, 400, 150);
        
        img = new GreenfootImage("menubg1.jpg");
        setBackground(img);
        addObject(new LevelScreen(), 405, 340);
        addObject(new Level1Button(), 310, 350);
        addObject(new Level2Button(), 400, 350);
        addObject(new Level3Button(), 490, 350);
        
        
        addObject(new ScoreButton(), 100, 550);
       
        addObject(new Purchase(), 250, 550);
        
        addObject(new ShareFriends(),400, 550);
        
        addObject(new Help(), 700, 550);

        addObject(new Sound(), 550, 550);
    }  

}
