
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List;
import java.util.Random;


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
    
    addObject(new Sound(), 740, 570); //sound icon
    addObject(new Menu(), 50, 570); //sound icon
    putBanana(680, 33, 1); //placed one banana for score screen 
    
    addObject(score, 700, 40);
    addObject(health, 100, 40); // set x, y coordinates
    
    addObject(monkey, 40, 480);
    addObject(trash, 570, 510);
    putBanana(60, 300, 2);
    putBanana(180, 250, 2);
    
  }
 

  public void act()
  { 
     
    if ((((Monkey)getObjects(Monkey.class).get(0)).getX() >= 785 ))
    {   
      trash.setFlag(false); //set flag to false aftor each level
      cactus.setFlag(false); //set flag to false aftor each level

     
      if (stage == 2) {
        this.removeObjects(this.getObjects(Banana.class));//remove previous stage bananas
        addObject(cactus, 200, 510);
        putBanana(230, 300, 3);
      }

      if (stage == 3) {
        this.removeObjects(this.getObjects(Banana.class));//remove previous stage bananas
        removeObject(trash);
        removeObject(cactus);
        addObject(cactus, 235, 510);
        putBanana(380, 350, 5);
    }
      
      if (stage == 4) {
        this.removeObjects(this.getObjects(Banana.class));//remove previous stage bananas
        removeObject(cactus);
        addObject(trash, 550, 510);
        putBanana(250, 330, 2);
        putBanana(580, 330, 1);
        addObject(power, 350, 500);  // To place "power" to get new power up 
      }
      
      
      if (stage == 5) {
        this.removeObjects(this.getObjects(Banana.class));//remove previous stage bananas
        removeObject(trash);
        removeObject(power); //remove "power" from stage 4 
        addObject(trash, 570, 510);
        addObject(cactus, 220, 500);
        putBanana(250, 450, 4);
      }
      
       //level completion    
      if (stage == 6) {
        ((Monkey)getObjects(Monkey.class).get(0)).getMusic().stop();
        new GreenfootSound("the-end.wav").play(); 
        stage = 1; //for removing error of background
        Greenfoot.setWorld(new LevelCompletedState(score));  //directs to level completed world with parameter score   
      }
      
      
       setBackground(new GreenfootImage("background" + stage + ".png"));
       ((Monkey)getObjects(Monkey.class).get(0)).setLocation(0, 480); //set location after each stage
       stage++;
    }
  } 
  
  public void putBanana(int x, int y, int qtd) {
   
    for (int i = 0; i < qtd; i++) {
      x += 60;
      addObject(new Banana(), x, y);
    }
  }
  
}
