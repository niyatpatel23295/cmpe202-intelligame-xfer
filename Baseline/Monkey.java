
import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.List;

public class Monkey extends Actor implements ScoreSubject
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

    //observer pattern
    private String state;
    private ScoreObserver observer;

    public Monkey()
    {
        this.state = "no points";
        music = new GreenfootSound("music.wav");
        music.playLoop(); 
        setImage(new GreenfootImage("monkey" + imagemParado + ".png"));
    }

    public void act()
    {
        actOnTouch(); //acts if monkey collects banana or c oin
        movement(); //acts according to key movement
    }

    public void movement()
    {
        boolean noKeyDown = true;

        if (((Monkey)getWorld().getObjects(Monkey.class).get(0)).getY() == 480) {
        
            if((Greenfoot.isKeyDown("left")) )  // when monkey walks backwards
            {
                noKeyDown = false;
                if (imagemMovimento == 7) 
                {
                    imagemMovimento = 3;
                }
                imagemMovimento += 1;
                setImage(new GreenfootImage("monkey" + imagemMovimento + ".png"));
                move(-10);
            }

            else if ((Greenfoot.isKeyDown("right")) ) //when monkey moves forward
            { 
                noKeyDown = false;
                if (imagemMovimento == 7) 
                {
                    imagemMovimento = 3;
                }
                imagemMovimento += 1;
                setImage(new GreenfootImage("monkey" + imagemMovimento + ".png"));
                move(10); //change in each step size
            }
        }
        if ((Greenfoot.isKeyDown("up")) || (inJump)) //when monkey jumps
        {
            noKeyDown = false;
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

            move(30); // change walking width (each step)
        } 
        if (noKeyDown) 
        {
            setImage(new GreenfootImage("monkey" + imagemParado + ".png"));
        }
        noKeyDown = false;
    }

    public void attach(ScoreObserver obj)
    {
        this.observer = obj;
    }

    public void notifyObservers()
    {
        if ( this.observer != null )
            this.observer.observerUpdate() ;

    }

    public String getState()
    {
        return state;
    }

    public void setState(String newState)
    {
        this.state = newState;
        notifyObservers();
    }


    public GreenfootSound getMusic()
    {
        return music;
    }

    public void actOnTouch()
    {
        if (isTouching(Banana.class)) 
        {
            ((Banana)getWorld().getObjects(Banana.class).get(0)).sound.play();
            setState("banana collected");
            removeTouching(Banana.class);
        }
        
        if (isTouching(Coin.class)) 
        {
            ((Coin)getWorld().getObjects(Coin.class).get(0)).sound.play();
            setState("coin collected");
            removeTouching(Coin.class);
        }
    }
    
    private void moveForward() {
        
    }    
    
    private void moveBackward() {
        
    } 
    
    private void jump() {
        
    } 
}
