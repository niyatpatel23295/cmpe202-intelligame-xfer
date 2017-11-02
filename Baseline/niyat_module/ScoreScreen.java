import greenfoot.Actor;
import greenfoot.Color;
import greenfoot.Font;
import greenfoot.GreenfootImage;

public class ScoreScreen extends Actor
{
  int scoreInitial = 0;

   public ScoreScreen()  
  {
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
  
  public void updatePoints(int score)
  {
    scoreInitial += score;
    
    GreenfootImage gim = getImage();
    gim.clear();
    Font font = new Font("Comics Sans MS", true, false, 50);
    
    gim.setColor(Color.BLACK);
    gim.setTransparency(50);
    gim.fill();
    
    gim.setColor(Color.WHITE);
    gim.setFont(font);
    new String();
    gim.drawString(String.valueOf(scoreInitial), 25, 45);
    
    setImage(gim);
  }
  public void getScore()
  {
      
  }
}
