package factory.abstractfactory.meals.japanese;

import factory.abstractfactory.meals.Meal;

public class Dinner implements Meal {

    private String description;
    boolean isTheBestFoodEver;

    public Dinner(){
        description = "3pc Salmon sushi, 3pc Squid sushi, 3pc Escolar (White Tuna) sushi, Miso soup";
        isTheBestFoodEver = true;
    }

    @Override
    public void dispayMeal() {
        System.out.println(description + " is " + (isTheBestFoodEver ? "the best food EVER!" : "horrible, but you're wrong"));
    }
}
