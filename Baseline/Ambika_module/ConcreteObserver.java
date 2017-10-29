import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConcreteObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteObserver extends Actor implements ScreenObserver  
{
    /**
     * Act - do whatever the ConcreteObserver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   protected ConcreteSubject subject = new ConcreteSubject();
   public ConcreteObserver()
    {
      // do nothing
    }
   
    
    public void updatePoints(int updateScore)
    {
        //do nothing
    }
}
