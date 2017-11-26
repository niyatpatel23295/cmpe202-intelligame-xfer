import greenfoot.Actor;
import greenfoot.Color;
import greenfoot.Font;
import greenfoot.GreenfootImage;
import greenfoot.Greenfoot;

/*
 * Observer for score observer pattern
 * increment score if banana is collected
 */

public class ScoreScreen extends Actor implements ScoreObserver
{
    private static int score = 0;
    private static ScoreScreen scoreInstance;
    private static GameStrategy strategy;
    private static Creator snackFactory;
    
    public void setStrategy(GameStrategy strategy){
        this.strategy = strategy;
        if (strategy instanceof FastMode) {
            snackFactory = new PaidModeFactory();
        }
        else if (strategy instanceof SlowMode) {
            snackFactory = new BasicModeFactory();
        }
    }
    public int getScore(){
        return score;
    }
    
    public Creator getSnackFactory() {
        return snackFactory;
    }
    
    public static ScoreScreen getInstance(){
        if(scoreInstance == null){
            scoreInstance = new ScoreScreen();
        }
        return scoreInstance;
    }
    
    
    

    private ScoreScreen()  
    {
       // scoreInitial = 0;
        
        
        
        //sets screen for displaying score
        GreenfootImage im = new GreenfootImage(140, 55);
        Font font = new Font("Comics Sans MS", true, false, 40);
        
        im.setColor(Color.BLACK);
        im.setTransparency(50);
        im.fill();
        
        im.setColor(Color.WHITE);
        im.setFont(font);
        im.drawString("0", 30, 45);
        setImage(im);
    }

    public void observerUpdate()
    {
        Monkey monkeySubject = (Monkey)getWorld().getObjects(Monkey.class).get(0); //adds subject Monkey to observer class 
        if (((Monkey)getWorld().getObjects(Monkey.class).get(0)).getState().equals("banana collected")){
            GameStrategyContext ctx = new GameStrategyContext(strategy);
            int speed = ctx.executeStrategy();
            Greenfoot.setSpeed(speed);
            score++;
}
        setNewScore();
    }
    
     public void resetSpeed(){
        Greenfoot.setSpeed(35);
    }
   
    
    public void resetScore(){
        score = 0;
    }
    
    public void reset(){
        scoreInstance = null;
        resetScore();
        resetSpeed();
    }

    public void setNewScore()
    {
        GreenfootImage gim = getImage();
        gim.clear();
        Font font = new Font("Comics Sans MS", true, false, 40);

        gim.setColor(Color.BLACK);
        gim.setTransparency(50);
        gim.fill();

        gim.setColor(Color.WHITE);
        gim.setFont(font);
        gim.drawString(String.valueOf(score), 30, 45);
        setImage(gim);
    }
}
