import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/*
 * child classes are Cactus, Trash and PowerUp
 */
public class ConcreteSubject extends Actor implements HealthSubject
{
    HealthObserver observer ;
    private String state = "No Change";
    private ArrayList<ConcreteSubject> subjects= new ArrayList<ConcreteSubject>();
    protected boolean flag = false;
    
    public String getState()
    {
        return state;
    }
    
    public void setFlag(boolean value)
    {
        flag = value;
    }
    
    public void act()
    {
       attachSubjects(); 
    }
    
    public void setState(String state)
    {
        this.state = state;
        notifyObserver();
    }
    
     public void attachSubjects()
    {
        subjects.add((Cactus)getWorld().getObjects(Cactus.class).get(0));
        subjects.add((Trash)getWorld().getObjects(Trash.class).get(0));
        subjects.add((PowerUp)getWorld().getObjects(PowerUp.class).get(0));
    }
      
    public void attach(HealthObserver obj)
    {
        this.observer = obj;
    }
    
    public void notifyObserver()
    {
        if(this.observer != null)
            observer.updateHealth(state);
    }
    
}
