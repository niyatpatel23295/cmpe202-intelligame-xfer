
import greenfoot.Greenfoot;
import greenfoot.Actor;
import greenfoot.GreenfootImage;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class MyWorld extends World
{
  private static final int WIDTH_SCREEN = 800;
  private static final int HEIGHT_SCREEN = 600;
  private static final int ACTOR_FLOOR = 480;
  private int stage = 2;
  
  private Creator snackFactory;
  private static final int NUM_STAGES = 6;
  private static final int NUM_SNACKS_PER_STAGE = 6;
  
  GreenfootSound music; 
  private GreenfootImage img;
  
  private Monkey monkey;
  private Cactus cactus;
  private Trash trash;
  private PowerUp power;
  private HealthScreen health;
  private ScoreScreen score; 

  private ArrayList<ISnack> bagOfSnacks;
  
  GameManager gm = GameManager.getInstance();
  
 public MyWorld()
  {
    super(800, 600, 1);
    
    img = new GreenfootImage("background1.png");
    setBackground(img);

    // Factory Design Pattern :: generate bag of snacks for level 1
    System.out.println( "Testing Level1Factory...") ;
    snackFactory = new Level1Factory() ;
    bagOfSnacks = snackFactory.getBagOfSnacks(); // banana, trash, cactus, extra
    //ArrayList<ISnack> snacks = snackFactory.generateRandomSnacks();
    
    //objects for play screen
    score = new ScoreScreen(); //records point collected
    health = new HealthScreen(); //dispalys health level of player
    monkey = new Monkey();
    
    trash = new Trash(); //(Trash)bagOfSnacks.get(1); //new Trash();
    cactus = new Cactus(); // (Cactus)bagOfSnacks.get(2); //new Cactus();
    power = new PowerUp(); //(PowerUp)bagOfSnacks.get(3); //new PowerUp();

    addObject(score, 700, 40); //score scrren at top right
    addObject(health, 100, 40); //health scrren at top left
    addObject(new Sound(), 740, 570); //quit button at bottom left
    addObject(new Menu(), 50, 570);
    //addObject(new BacktoMenu(), 200, 570); //BacktoMenu button at top left
    
    //stage 1 construction
    addObject(monkey, 40, 480);
    addObject(trash, 570, 510);
    putBanana(60, 300, 5);
 
    //score observer pattern
    monkey.attach(score);//attaching observer to subject
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
        //Greenfoot.setWorld(new LevelCompletedWorld(score));  //directs to level completed world with parameter score   
        gm.levelCompleted();
        stage = 1; //for removing error of background
      }  
       ((Monkey)getObjects(Monkey.class).get(0)).setLocation(0, 480); //set location after each stage
       setBackground(new GreenfootImage("background" + stage + ".png"));

       if (stage > 1) stage++;
    }
  } 
  
  public void putBanana(int x, int y, int qtd) {
   
    for (int i = 0; i < qtd; i++) {
      x += 60;
      Banana bnbn = (Banana)bagOfSnacks.get(0);
      addObject(new Banana(), x, y);
    }
  }
  
  public ScoreScreen getScoreScreen() {
    return score; 
  }
  
  public void putSnacks(ArrayList<ISnack> snacks, int StageNumber) {
      
      if (StageNumber > 1) { // remove previous stage's objects from screen
          int StartIndex = NUM_SNACKS_PER_STAGE * StageNumber;
          int endIndex = StartIndex + NUM_SNACKS_PER_STAGE;
          int x = StageNumber * 150;
          int y = 300;
          // for (int i = StartIndex-NUM_SNACKS_PER_STAGE; i < StartIndex; i++) {
          //     removeObject((Actor)snacks.get(i));
          // }
          //this.removeObjects((Collection)snacks.subList(StartIndex-NUM_SNACKS_PER_STAGE, NUM_SNACKS_PER_STAGE));
          

          for (int i = StartIndex; i < endIndex; i++) {
              x += 60;
              addObject((Actor)snacks.get(i), x, y);
          }
      }  
      
  }
  
  public static int getNumSnacksPerStage() {
      return NUM_SNACKS_PER_STAGE;
  }
  
  public static int getNumStages() {
      return NUM_STAGES;
  }


  
}
