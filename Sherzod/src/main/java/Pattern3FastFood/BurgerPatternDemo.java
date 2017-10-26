package Pattern3FastFood;

/**
 * Created by Sherzod on 10/24/2017.
 */
public class BurgerPatternDemo {
    public static void main(String[] args) {
        MealBurger mealBurger = new MealBurger();

        Meal meal = mealBurger.prepareVegMeal();
        System.out.println("VegMeal:");
        meal.showItems();
        System.out.println("Total cost: "+meal.getCost());

        Meal nonVegMeal = mealBurger.prepareNonVegMeal();
        System.out.println("NonVegMeal:");
        nonVegMeal.showItems();
        System.out.println("Total cost: "+nonVegMeal.getCost());
    }
}
