package factory.abstractfactory.meals.japanese;

import factory.abstractfactory.meals.Meal;

public class Breakfast implements Meal {

    private String description;
    private int calories;

    public Breakfast(){
        description = "Tamago Kake Gohan:\n" +
                "Steamed rice, Raw egg, Sesame seeds, Soy sauce";
        calories = 335;
    }

    @Override
    public void dispayMeal() {
        System.out.println(description + " is " + calories + " calories.");
    }
}
