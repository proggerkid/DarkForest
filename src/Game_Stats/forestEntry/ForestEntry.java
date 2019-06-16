package Game_Stats.forestEntry;
import Game_Stats.*;

public class ForestEntry extends CurrState {
	public ForestEntry() {
		this.currLocation = "entry";
	}
	public void showEnvironment() {
		System.out.println("*********************");
		System.out.println("---Forest Entry---");
		System.out.println("There are three pathes you can choose: ");
		System.out.println("left path, middle path, right path");
		System.out.println("*********************");
	}
}
