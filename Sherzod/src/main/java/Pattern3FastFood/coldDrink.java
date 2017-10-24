package Pattern3FastFood;

/**
 * Created by Sherzod on 10/24/2017.
 */
public abstract class coldDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
