package state;

public interface IGameState
 {
	 
	public abstract void setStateRunning();
	public abstract void doPowerOff();
	public abstract void doSuspend();
	public abstract void doReset();
}