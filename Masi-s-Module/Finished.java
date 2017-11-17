
import greenfoot.Actor;

public class Finished extends Actor
{
  public Finished() {}
  
  public void act() {
    getWorld().addObject(new LevelButton(), 350, 250);
      getWorld().addObject(new Menu(), 350, 320);
        getWorld().addObject(new QuitButton(), 350, 380);
    }
}
