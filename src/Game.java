import Game_Stats.*;
import java.util.Scanner;

public class Game {
	private boolean close = false;
	private String input = "";
	Scanner scanner = new Scanner(System.in);
	Menue menue = new Menue();
	ForestEntry forestEntry = new ForestEntry();
	
	public void start() {
		menue.welcome();
		while(!close) {
			System.out.print("enter: ");
			input = scanner.next();
			switch(input) {
			case "exit": 
				close = true;
				break;
			case "menue": 
				menue.printMenue();
				break;
			case "help":
				menue.printHelp();
			}
		}
		System.out.println("bye");
	}
}
