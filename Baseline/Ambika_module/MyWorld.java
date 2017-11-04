
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
  
  GreenfootSound music; 
  private GreenfootImage img;
  
  private Monkey monkey;
  private Cactus cactus;
  private Trash trash;
  private PowerUp power;
  private HealthScreen health;
  private ScoreScreen score;
  private Coin coin;  
  private Time timer; 
 
 public MyWorld()
  {
    super(800, 600, 1);
    
    img = new GreenfootImage("background1.png");
    setBackground(img);
    
    score = new ScoreScreen();
    health = new HealthScreen(); // added a new health screen to record power level
    trash = new Trash();
    monkey = new Monkey();
    cactus = new Cactus();
    power = new PowerUp();
    
    coin =new Coin();
    timer = new Time();
    
    addObject(new Sound(), 740, 570); //sound icon
    addObject(new Menu(), 50, 570); //sound icon
    putBanana(680, 33, 1); //placed one banana for score screen 
    
    addObject(score, 700, 40);
    addObject(health, 100, 40); // set x, y coordinates
    addObject(timer, 700, 100);
    
    addObject(monkey, 100, 480);
    addObject(trash, 550, 510);
    putBanana(100, 300, 4);
  }
  

  public void act()
  { 
     
    if ((((Monkey)getObjects(Monkey.class).get(0)).getX() >= 785 ))
    {   
      trash.setFlag(false); //set flag to false aftor each level
      cactus.setFlag(false);
      if (stage == 6) {
        ((Monkey)getObjects(Monkey.class).get(0)).getMusic().stop();
        new GreenfootSound("the-end.wav").play(); 
        stage = 1; //for removing error of background6.png
        Greenfoot.setWorld(new LevelCompletedState(score));  //directs to level completed world with parameter score   
      }
      
      setBackground(new GreenfootImage("background" + stage + ".png"));
      ((Monkey)getObjects(Monkey.class).get(0)).setLocation(0, 480);
     
      if (stage == 2) {
        addObject(trash, 550, 510);
        addObject(cactus, 200, 510);
        putBanana(100, 280, 2);
      }

      if (stage == 3) {
        removeObject(trash);
        removeObject(cactus);
        addObject(cactus, 228, 500);
        putBanana(380, 150, 2);
        addObject(coin, 250, 400); //add coin  
  }
      
      if (stage == 4) {

        removeObject(cactus);
        addObject(trash, 550, 510);
        putBanana(250, 330, 2);
        putBanana(580, 330, 2);
        addObject(power, 350, 500);  // To place "power" to get new power up 
      }
      
      
      if (stage == 5) {
        removeObject(trash);
        removeObject(power); //remove "power" from stage 4 
        addObject(trash, 550, 510);
        addObject(cactus, 228, 500);
        putBanana(250, 450, 3);
       
      }
      
      stage += 1;
    }
  }
  
  public void putBanana(int x, int y, int qtd) {
   
    for (int i = 0; i < qtd; i++) {
      x += 60;
      addObject(new Banana(), x, y);
    }
  }
 


}
