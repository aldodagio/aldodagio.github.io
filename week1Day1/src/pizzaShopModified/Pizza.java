package pizzaShopModified;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<>();
	void prepare() {
		System.out.println("Prepare" + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings...");
		for(String topping: toppings) 
		  System.out.println(" " + topping);
		
	}
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	void cut() {
		System.out.println("Cut the pizza into diagonal slices");
	}
	void box() {
		System.out.println("Place pizza in official pizza store box");
	}
	public String getName() { return name; }
	public String getDough() { return dough; }
	public String getSauce() { return sauce; }
	public ArrayList<String> getToppings() { return toppings; }
	public String toString() { return "Pizza [name = " + name + " dough = " + dough + " sauce = " + sauce + " toppings = " + toppings + " ]"; }
	
}
