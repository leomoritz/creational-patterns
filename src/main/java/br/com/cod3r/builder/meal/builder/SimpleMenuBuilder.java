package br.com.cod3r.builder.meal.builder;

public class SimpleMenuBuilder extends FastFoodMealBuilder {
    @Override
    public void buildDrink() {
        meal.setDrink("Coca-Cola Lata");
    }

    @Override
    public void buildMain() {
        meal.setMain("X-Burguer Salada");
    }

    @Override
    public void buildSide() {
        //No Side
    }

    @Override
    public void buildDessert() {
        //No Dessert
    }

    @Override
    public void buildGift() {
        //No Gift
    }
}
