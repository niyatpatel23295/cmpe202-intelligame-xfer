import greenfoot.Greenfoot;

public class GamePausedState extends GameState {

    public GamePausedState( GameManager gm )
    {
        super( gm ) ;
    }

    @Override
    public void setStateStart() {
       //Greenfoot.setWorld(new HomeWorld());
       game_manager.setWorld(new HomeWorld());
       game_manager.setState(GameStates.START);
    }

    @Override
    public void setStateRunning(){
    	//Greenfoot.start();
    	game_manager.setState(GameStates.RUNNING);
    	game_manager.setWorld(new MyWorld());
    }
}