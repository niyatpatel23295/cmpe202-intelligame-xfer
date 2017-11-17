package MrMonkey;

/*
Created by: Masi Nazarian
Date: 11/11/2017
*/

public class GameLevel1Finished  extends GameState {

	public GameLevel1Finished( GameWorld gw )
    {
        super( gw ) ;
    }

    @Override
    public void goLevel1Running() {
        GameWorld.setState( GameStates.LEVEL1RUNNING );
    }

    @Override
    public void goPaused() {
        GameWorld.setState( GameStates.PAUSED );
    }

    @Override
    public void goExited() {
        GameWorld.setState( GameStates.EXITED );
    }

}