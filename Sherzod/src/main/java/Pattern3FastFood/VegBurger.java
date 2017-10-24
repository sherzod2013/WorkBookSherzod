package Pattern3FastFood;

/**
 * Created by Sherzod on 10/24/2017.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25;
    }
}
