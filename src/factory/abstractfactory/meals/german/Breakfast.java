package factory.abstractfactory.meals.german;

import factory.abstractfactory.meals.Meal;

public class Breakfast implements Meal {

    private String description;
    private int calories;

    public Breakfast() {
        description = "Rashers, Pancakes, and Fruit Bowl";
        calories = 355;
    }

    @Override
    public void dispayMeal() {
        System.out.println(description + " is " + calories + " calories.");
    }
}
