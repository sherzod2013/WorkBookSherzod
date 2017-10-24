package Pattern3FastFood;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sherzod on 10/24/2017.
 */
public class Meal {
   private List<Item>  items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }
    public float getCost(){
        float cost = 0.0f;
        for (Item item: items) {
            cost+=item.price();
        }
        return cost;
    }
    public void showItems(){
        for (Item item: items  ) {
            System.out.println("Item: "+item.name());
            System.out.println("Packing: "+item.packing().pack());
            System.out.println("Price: "+ item.price());
        }
    }

}
