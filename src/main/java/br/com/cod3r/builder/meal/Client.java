package br.com.cod3r.builder.meal;

import br.com.cod3r.builder.meal.builder.HouseMenuBuilder;
import br.com.cod3r.builder.meal.builder.SimpleMenuBuilder;
import br.com.cod3r.builder.meal.builder.SpecialMenuBuilder;
import br.com.cod3r.builder.meal.director.MealDirector;
import br.com.cod3r.builder.meal.model.FastFoodMeal;

public class Client {
	
	public static void main(String[] args) {
		//Instanciando os directors responsável por construir cada menu
		MealDirector houseMenuDirector = new MealDirector(new HouseMenuBuilder());
		MealDirector simpleMenuDirector = new MealDirector(new SimpleMenuBuilder());
		MealDirector specialMenuDirector = new MealDirector(new SpecialMenuBuilder());

		//Construindo o lanche a partir do menu desejado
		FastFoodMeal housesCombo = houseMenuDirector.build();
		FastFoodMeal simplesCombo = simpleMenuDirector.build();
		FastFoodMeal specialsCombo = specialMenuDirector.build();

		//Imprimindo os lanches
		System.out.println(housesCombo);
		System.out.println("\n");
		System.out.println(simplesCombo);
		System.out.println("\n");
		System.out.println(specialsCombo);
	}
}