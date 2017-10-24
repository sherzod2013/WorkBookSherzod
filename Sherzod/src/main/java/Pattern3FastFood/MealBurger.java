package Pattern3FastFood;

/**
 * Created by Sherzod on 10/24/2017.
 */
public class MealBurger {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChikenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
