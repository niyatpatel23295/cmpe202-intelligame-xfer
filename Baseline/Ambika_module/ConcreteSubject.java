import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConcreteSubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteSubject extends Actor implements Subject
{
    /**
     * Act - do whatever the ConcreteSubject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //ScreenObserver healthObserver;
    private int updateScore;
   
    public int getScore()
    {
        return updateScore;
    }
    
    public void act()
    {
       //do nothing  
    }
    public void setScore(int newScore)
    {
        this.updateScore = newScore;
        notifyObserver();
    }
      
    //public void attach(HealthScreen obj)
    //{
    //    this.healthObserver = obj;
    //}
    
    public void notifyObserver()
    {
        //healthObserver.updatePoints(updateScore);
       ((HealthScreen)getWorld().getObjects(HealthScreen.class).get(0)).updatePoints(updateScore);
    }
    
}
