package MrMonkey;

/*
Created by: Masi Nazarian
Date: 11/11/2017
*/

public class GameState implements IGameState {
 
	GameWorld gameWorld;
	 
	public GameState(GameWorld gw) {
        gameWorld = gw ;
	}

	public void goReadyToStart() {
		// no implementation
	}

  	public void goLevel1Running() {}
  	public void goLevel1Finished() {}
  	public void goLevel2Running() {}
  	public void goLevel2Finished() {}
  	public void goLevel3Running() {}
  	public void goLevel3Finished() {}
  	public void goPaused() {}
  	public void goGameOver() {}
  	public void goExited() {}
	 
}