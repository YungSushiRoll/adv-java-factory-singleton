package factory.abstractfactory.meals.japanese;

import factory.abstractfactory.meals.Meal;

public class Lunch implements Meal {

    private String description;

    public Lunch(){
        description = "Onigiri rice balls, Ramen noodles, Steamed vegetables";
    }

    @Override
    public void dispayMeal() {
        System.out.println(description);
    }
}
