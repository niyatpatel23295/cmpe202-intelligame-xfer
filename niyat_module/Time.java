import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Timer;
import java.util.TimerTask;
/**
 * Write a description of class Time here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Time extends Actor
{
    /**
     * Act - do whatever the Time wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Timer timer;
    int timeInitial = 0;
    public Time() 
    {
        // Add your action code here.
        timer = new Timer () ;
        GreenfootImage im = new GreenfootImage(140, 55);
        Font font = new Font("Comics Sans MS", true, false, 40);
        im.setColor(Color.RED);
        im.setTransparency(50);
        im.fill();
        im.setColor(Color.WHITE);
        im.setFont(font);
        im.drawString("0", 30, 45);
        
        setImage(im);
        timer.schedule( new UpdateTime(), 1000 ) ;
    }

    class UpdateTime extends TimerTask
    {
      public void run(){
          timer = new Timer();
          timeInitial += 1;
        
          GreenfootImage gim = getImage();
          gim.clear();
          Font font = new Font("Comics Sans MS", true, false, 50);
        
          gim.setColor(Color.BLACK);
          gim.setTransparency(50);
          gim.fill();
         
          gim.setColor(Color.WHITE);
          gim.setFont(font);
          new String();
          gim.drawString(String.valueOf(timeInitial), 25, 45);
        
          setImage(gim);
          timer.schedule( new UpdateTime(), 1000 );

        }
        
    }
}
