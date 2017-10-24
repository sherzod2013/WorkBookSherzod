package Pattern3FastFood;

/**
 * Created by Sherzod on 10/24/2017.
 */
public abstract class Burger implements Item  {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
    @Override
    public abstract float price();
}

