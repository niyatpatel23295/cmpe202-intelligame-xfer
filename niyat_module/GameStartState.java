import greenfoot.Greenfoot;

public class GameStartState extends GameState {

    public GameStartState( GameManager gm )
    {
        super( gm ) ;
    }

    @Override
    public void setStateRunning() {
       Greenfoot.setWorld(new MyWorld());
    }

}