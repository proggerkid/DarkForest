package DarkForest;
import Game_Stats.*;
import Game_Stats.forestEntry.ForestEntry;
import Game_Stats.forestEntry.LeftPath;

import java.util.Scanner;
import Charakter.*;
	
public class Game {
	private boolean close = false;
	private String input = "";
	private Scanner scanner = new Scanner(System.in);
	private Menue menue = new Menue();
	public CurrState currState = new ForestEntry();
	private Charakter charakter = new Charakter();
	
	//start the game by calling this method in main function
	public void start() {
		menue.welcome();
		//game loop
		while(!close) {
			
			if(currState.checkState) {				
				if(currState.nextState == "left path") {
					currState = new LeftPath();
				}
			}

			//player enter commands
			System.out.print("enter: ");
			input = scanner.nextLine();
			
			//evaluate players input
			switch(input) {
			case "exit": 
				close = true;
				break;
			case "menue": 
				menue.printMenue();
				break;
			case "help":
				menue.printHelp();
				break;
			case "show inv":
				charakter.inventory.showItems();
				break;
			case "show env":
				currState.showEnvironment();
			}
		
			currState.update(input);
			
		}
		
		System.out.println("bye");
	}
}
