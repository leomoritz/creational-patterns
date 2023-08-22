package br.com.cod3r.builder.meal.builder;

public class HouseMenuBuilder extends FastFoodMealBuilder {
    @Override
    public void buildDrink() {
        meal.setDrink("Coca-Cola Lata");
    }

    @Override
    public void buildMain() {
        meal.setMain("X-Burguer Duplo Cheddar Cremoso");
    }

    @Override
    public void buildSide() {
        meal.setSide("Batata-Frita Média");
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
