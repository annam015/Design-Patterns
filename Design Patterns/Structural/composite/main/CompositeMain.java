package composite.main;

import composite.classes.*;

public class CompositeMain {

	public static void main(String[] args) throws Exception {
		Item sparklingWater = new Item(1, "Sparkling Water", 5.25);
		Item mineralWater = new Item(2, "Mineral Water", 5.45);
		Item espresso = new Item(3, "Espresso", 8.2);
		Item cappuccino = new Item(4, "Cappuccino", 8.8);
		Item lemonade = new Item(5, "Lemonade", 10);	
		Item margarita = new Item(6, "Margarita", 25.9);
		Item maiTai = new Item(7, "Mai Tai", 27.5);
		Item cosmopolitan = new Item(8, "Cosmopolitan", 25.8);
		Item oldFashioned = new Item(9, "Old Fashioned", 29.3);
		Item martini  = new Item(10, "Martini", 27.8);
		Item cocaCola = new Item(11, "Coca Cola", 9.5);
		Item flavoredIceTea = new Item(12, "Flavored Ice Tea", 12.8);
		Item beer = new Item(13, "Beer", 8.0);
		
		Menu nonAlcoholicDrinks = new Menu("Non-Alcoholic Drinks Menu");
		nonAlcoholicDrinks.addComponent(sparklingWater);
		nonAlcoholicDrinks.addComponent(mineralWater);
		nonAlcoholicDrinks.addComponent(espresso);
		nonAlcoholicDrinks.addComponent(cappuccino);
		nonAlcoholicDrinks.addComponent(lemonade);
		nonAlcoholicDrinks.addComponent(cocaCola);
		nonAlcoholicDrinks.addComponent(flavoredIceTea);
		
		Menu alcoholicDrinks = new Menu("Alcoholic Drinks Menu");
		alcoholicDrinks.addComponent(margarita);
		alcoholicDrinks.addComponent(maiTai);
		alcoholicDrinks.addComponent(cosmopolitan);
		alcoholicDrinks.addComponent(oldFashioned);
		alcoholicDrinks.addComponent(martini);
		alcoholicDrinks.addComponent(beer);
		
		Menu drinksMenu = new Menu("Drinks Menu");
		drinksMenu.addComponent(nonAlcoholicDrinks);
		drinksMenu.addComponent(alcoholicDrinks);
		
		drinksMenu.describe();
		
		alcoholicDrinks.deleteComponent(beer);
		drinksMenu.describe();

		nonAlcoholicDrinks.getComponent(0).describe();		
	}

}