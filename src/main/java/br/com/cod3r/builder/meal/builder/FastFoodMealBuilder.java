package br.com.cod3r.builder.meal.builder;

import br.com.cod3r.builder.meal.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {

    protected FastFoodMeal meal;

    public FastFoodMealBuilder() {
        this.meal = new FastFoodMeal();
    }

    public FastFoodMeal getMeal() {
        return this.meal;
    }

    public abstract void buildDrink();
    public abstract void buildMain();
    public abstract void buildSide();
    public abstract void buildDessert();
    public abstract void buildGift();
}
