import Game_Stats.*;
import Game_Stats.forestEntry.ForestEntry;

import java.util.Scanner;
import Charakter.*;
	
public class Game {
	private boolean close = false;
	private String input = "";
	private boolean testingGamestateInstance = true;
	private Scanner scanner = new Scanner(System.in);
	private Menue menue = new Menue();
	public CurrState currState = new ForestEntry();
	public ForestEntry gameState = null; 
	private Charakter charakter = new Charakter();
	
	//start the game by calling this method in main function
	public void start() {
		menue.welcome();
		//game loop
		while(!close) {
			
			//choose the right game state type
			if(testingGamestateInstance) {
				if(this.currState instanceof ForestEntry) {
					this.gameState = (ForestEntry) currState;
				}
				
				testingGamestateInstance = false;
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
				gameState.showEnvironment();
			}
		
		}
		
		System.out.println("bye");
	}
}
