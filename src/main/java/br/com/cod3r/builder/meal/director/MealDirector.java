package br.com.cod3r.builder.meal.director;

import br.com.cod3r.builder.meal.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.meal.model.FastFoodMeal;

public class MealDirector {

    private FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder) {
        this.builder = builder;
    }

    public FastFoodMeal build() {
        builder.buildDrink();
        builder.buildMain();
        builder.buildSide();
        builder.buildDessert();
        builder.buildGift();
        return builder.getMeal();
    }
}
