
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List;



public class MyWorld extends World
{
  private static final int WIDTH_SCREEN = 800;
  private static final int HEIGHT_SCREEN = 600;
  private static final int ACTOR_FLOOR = 480;
  private int stage = 2;
  
  private GreenfootSound music;
  
  private GreenfootImage img;
  
  private Trash trash;
  private Title title;
  private Monkey monkey;
  private Cactus cactus;
  
  public MyWorld()
  {
    super(800, 600, 1);
    
    img = new GreenfootImage("background1.png");
    ScoreScreen score = new ScoreScreen();
    setBackground(img);
    

    title = new Title();
    trash = new Trash();
    monkey = new Monkey();
    cactus = new Cactus();
    

    addObject(title, 410, 200);
    addObject(score, 700, 50);
    addObject(monkey, 100, 480);
    addObject(trash, 550, 510);
    
    putBanana(350, 400, 4);
    putBanana(100, 280, 4);
  }
  




  public void act()
  {
    removeObject(title);
    
    if (((Monkey)getObjects(Monkey.class).get(0)).getX() >= 785)
    {
      if (stage == 6) {
        Greenfoot.stop();
        ((Monkey)getObjects(Monkey.class).get(0)).getMusic().stop();
        new GreenfootSound("the-end.wav").play();
        addObject(new Finished(), 410, 200);
        
        return;
      }
      
      setBackground(new GreenfootImage("background" + stage + ".png"));
      ((Monkey)getObjects(Monkey.class).get(0)).setLocation(0, 480);
      

      if (stage == 2) {
        addObject(trash, 550, 510);
        putBanana(100, 280, 4);
      }
      


      if (stage == 3) {
        removeObject(trash);
        addObject(cactus, 228, 500);
        
        putBanana(250, 405, 7);
        putBanana(250, 330, 7);
      }
      


      if (stage == 4) {
        removeObject(cactus);
        addObject(trash, 550, 510);
        
        putBanana(50, 450, 6);
        putBanana(560, 330, 3);
      }
      


      if (stage == 5) {
        removeObject(trash);
        addObject(trash, 550, 510);
        addObject(cactus, 228, 500);
        
        putBanana(250, 450, 3);
        putBanana(560, 330, 3);
      }
      
      stage += 1;
    }
  }
  
  public GreenfootSound getMusic()
  {
    return music;
  }
  
  public void putBanana(int x, int y, int qtd) {
    for (int i = 0; i < qtd; i++) {
      x += 70;
      addObject(new Banana(), x, y);
    }
  }
}
