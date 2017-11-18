import greenfoot.Actor;
import greenfoot.Color;
import greenfoot.Font;
import greenfoot.GreenfootImage;

/*
 * Observer for score observer pattern
 * increment score if banana is collected
 */

public class ScoreScreen extends Actor implements ScoreObserver
{
    private int scoreInitial;
    //public static ScoreScreen ss;

    public ScoreScreen()  
    {
        scoreInitial = 0;
        
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

    // public static ScoreScreen getInstance() {
    //     if (ss == null) {
    //         ss = new ScoreScreen();
    //     }
    //     return ss;
    // }

    public int getScore() {
        return scoreInitial;
    }
    
    
    public void observerUpdate()
    {
        Monkey monkeySubject = (Monkey)getWorld().getObjects(Monkey.class).get(0); //adds subject Monkey to observer class 
        if (((Monkey)getWorld().getObjects(Monkey.class).get(0)).getState().equals("banana collected"))
            scoreInitial++;
        if (((Monkey)getWorld().getObjects(Monkey.class).get(0)).getState().equals("coin collected"))
            scoreInitial += 3;
        setNewScore();
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
        gim.drawString(String.valueOf(scoreInitial), 30, 45);
        setImage(gim);
    }
}
