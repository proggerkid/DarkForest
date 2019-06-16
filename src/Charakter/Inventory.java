package Charakter;
import java.util.List;
import java.util.ArrayList;
import Items.*;

public class Inventory {
	
	public List<Item> items = new ArrayList<>();
	public Flashlight f1 = new Flashlight();
	
	public Inventory() {
		items.add(f1);
	}
	
	public void showItems() {
		for(int i = 0; i < items.size(); i++) {
			System.out.println("*************************");
			System.out.println(items.get(i).name);
			System.out.println("*************************");
		}
	}
	
}
