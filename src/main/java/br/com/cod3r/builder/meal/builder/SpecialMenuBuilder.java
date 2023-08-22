package br.com.cod3r.builder.meal.builder;

public class SpecialMenuBuilder extends FastFoodMealBuilder {
    @Override
    public void buildDrink() {
        meal.setDrink("Coca-Cola 600Ml");
    }

    @Override
    public void buildMain() {
        meal.setMain("X-Burguer Magnífico");
    }

    @Override
    public void buildSide() {
        meal.setSide("Batata-Frita Rústica");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Top-Sundae");
    }

    @Override
    public void buildGift() {
        meal.setToy("Jesus Toy");
    }
}
