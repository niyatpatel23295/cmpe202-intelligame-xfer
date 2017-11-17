import greenfoot.Greenfoot;

public class GameRunningState extends GameState {

    public GameRunningState( GameManager gm )
    {
        super( gm ) ;
    }

    @Override
    public void setStateStopped() {
       Greenfoot.setWorld(new MyWorld());
    }

    @Override
    public void setStatePaused() {
       Greenfoot.stop();
    }

}