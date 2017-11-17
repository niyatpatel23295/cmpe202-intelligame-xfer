//import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List;



public class Level3World extends World
{
  private static final int WIDTH_SCREEN = 800;
  private static final int HEIGHT_SCREEN = 600;
  private static final int ACTOR_FLOOR = 480;
  private int stage = 2;
  
  GreenfootSound music; 
  private GreenfootImage img;
  
  private Trash trash;
  private Monkey monkey;
  private Cactus cactus;
  private PowerUp power;
  
  /**
     * Constructor for objects of class Level3World.
     * 
     */
  public Level3World()
  {
        super(800, 600, 1); 
    
    img = new GreenfootImage("nightbackground1.png");
    setBackground(img);
    
    ScoreScreen score = new ScoreScreen();
    HealthScreen health = new HealthScreen(); // added a new health screen to record power level

    trash = new Trash();
    monkey = new Monkey();
    cactus = new Cactus();
    power = new PowerUp();
    
    addObject(new Sound(), 740, 570); //sound icon
    addObject(new Menu(), 50, 570); //sound icon
    putBanana(680, 33, 1); //placed one banana for score screen 
    addObject(score, 700, 40);
    addObject(health, 100, 40); // set x, y coordinates
    addObject(monkey, 100, 480);
    addObject(trash, 550, 510);
    putBanana(100, 300, 4);
  }
  



  public void act()
  {

    if (((Monkey)getObjects(Monkey.class).get(0)).getX() >= 785)
    {
      trash.setFlag(false); //set flag to false aftor each level
      cactus.setFlag(false);
      
      if (stage == 6) {

        //Greenfoot.stop();
        ((Monkey)getObjects(Monkey.class).get(0)).getMusic().stop();
        new GreenfootSound("the-end.wav").play();
        //addObject(new Finished(), 410, 200);
        Level level = new Level();
        addObject(level, 400, 300);
        addObject(new ScoreScreen(), 430, 260);
        addObject(new NextLevel(), 380, 350);
        addObject(new QuitButton(), 380, 420);
        
        
        //return;
      }
      else {
      setBackground(new GreenfootImage("nightbackground" + stage + ".png"));
      ((Monkey)getObjects(Monkey.class).get(0)).setLocation(0, 480);
      }
     
      if (stage == 2) {
        addObject(trash, 550, 510);
        addObject(cactus, 200, 510);
        putBanana(100, 280, 2);
      }
      
      

      if (stage == 3) {
        removeObject(trash);
        removeObject(cactus);
        addObject(cactus, 228, 500);
        putBanana(250, 370, 4);

      }
      


      if (stage == 4) {
        removeObject(cactus);
        addObject(trash, 550, 510);
        putBanana(560, 330, 3);
        addObject(power, 260, 500);  // To place "heart" to get new power up 
      }
      


      if (stage == 5) {
        removeObject(trash);
        removeObject(power); //remove "heart" from stage 4 
        addObject(trash, 550, 510);
        addObject(cactus, 228, 500);
        putBanana(250, 450, 3);
      }
      
      if(stage != 6){
      stage += 1;
      }
    }
  }
  
  public void putBanana(int x, int y, int qtd) {
   
    for (int i = 0; i < qtd; i++) {
      x += 60;
      addObject(new Banana(), x, y);
    }
  }
}
