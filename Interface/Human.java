package org.tnsif.interfaceexecutor;
//child class
public class Human implements ColdDrink, AlcoholDrinks{

	@Override
	public void showDrink() {
		System.out.println("Cold Drink Name: "+ColdDrinkName+"\nAlcohol Type: "+AlcoholType+"\nAlcohol Brand: "+ Brand);
		
	}

}
