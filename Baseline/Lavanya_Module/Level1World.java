import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;


public class Level1World extends World implements LevelStrategy {

	public Level1World(){
	 super(800, 600, 1);
	}

	@Override
	public void getSpeed() {
		// TODO Auto-generated method stub
			int speed = 40;
			Greenfoot.setSpeed(speed);
		
	}

	@Override
	public void setLevelBackground(int stage) {
		setBackground(new GreenfootImage("background" + stage + ".png"));
		// TODO Auto-generated method stub
		
	}

}
