
import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List;

public class Monkey
  extends Actor
{
  private int imagemMovimento = 3;
  private int imagemParado = 1;
  private boolean inJump = false;
  private int countJump = 8;
  private static final int G_FORCE = 60;
  private int countJumpReverse = 11;
  private int ACTOR_FLOOR = 480;
  private int y = ACTOR_FLOOR;
  private GreenfootSound music;
  
  public Monkey()
  {
    music = new GreenfootSound("music.wav");
    music.playLoop();
    setImage(new GreenfootImage("monkey" + imagemParado + ".png"));
  }
  
  public void act()
  {
    if ((Greenfoot.isKeyDown("right")) && (((Monkey)getWorld().getObjects(Monkey.class).get(0)).getY() == 480)) {
      if (imagemMovimento == 7) {
        imagemMovimento = 3;
      }
      imagemMovimento += 1;
      setImage(new GreenfootImage("monkey" + imagemMovimento + ".png"));
      move(15);
    }
    else if ((Greenfoot.isKeyDown("up")) || (inJump))
    {
      inJump = true;
      
      if (countJump == 12) {
        y += 60;
        setImage(new GreenfootImage("monkey" + countJumpReverse + ".png"));
        
        int x = ((Monkey)getWorld().getObjects(Monkey.class).get(0)).getX();
        ((Monkey)getWorld().getObjects(Monkey.class).get(0)).setLocation(x, y);
        countJumpReverse -= 1;
        
        if (countJumpReverse == 7) {
          inJump = false;
          countJump = 8;
          countJumpReverse = 11;
          y = ACTOR_FLOOR;
        }
      }
      else
      {
        setImage(new GreenfootImage("monkey" + countJump + ".png"));
        countJump += 1;
        y -= 60;
        int x = ((Monkey)getWorld().getObjects(Monkey.class).get(0)).getX();
        ((Monkey)getWorld().getObjects(Monkey.class).get(0)).setLocation(x, y);
      }
      move(40);
    } else {
      setImage(new GreenfootImage("monkey" + imagemParado + ".png"));
    }
  }
  
  public GreenfootSound getMusic()
  {
    return music;
  }
}
