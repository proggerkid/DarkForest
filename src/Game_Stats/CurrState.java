package Game_Stats;

public abstract class CurrState {
	public boolean checkState = false;
	public String nextState;
	
	public abstract void update(String input);
	public abstract void showEnvironment();
}
