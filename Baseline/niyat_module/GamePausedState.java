import greenfoot.Greenfoot;

public class GamePausedState extends GameState {

    public GamePausedState( GameManager gm )
    {
        super( gm ) ;
    }

    @Override
    public void setStateStart() {
       Greenfoot.setWorld(new MyWorld());
    }

    @Override
    public void setStateRunning(){
    	Greenfoot.start();
    }
}