package Game_Stats.forestEntry;
import Game_Stats.*;

public class ForestEntry extends CurrState {
	
	
	@Override
	public void showEnvironment() {
		System.out.println("*********************");
		System.out.println("---Forest Entry---");
		System.out.println("There are three pathes you can choose: ");
		System.out.println("left path, middle path, right path");
		System.out.println("*********************");
	}
	
	@Override
	public void update(String input) {
		switch(input) {
		case "left path":
			this.nextState = "left path";
			this.checkState = true;
			break;
		}
	}

}
