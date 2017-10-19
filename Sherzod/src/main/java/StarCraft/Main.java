package StarCraft;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Sherzod on 10/19/2017.
 */
public class Main {
    public static void main(String[] args) {
        SCPlayer[] batle = {
                new SCPlayer("SuperMax",
                        League.SILVER, 57),
                new SCPlayer("IvanZergling",
                        League.GOLD, 100),
                new SCPlayer("killer13fx",
                        League.PRACTICE, 0),
                new SCPlayer("MaxRusher",
                        League.SILVER, 57)
        };
        Arrays.sort(batle, new Comparator<SCPlayer>() {
            @Override
            public int compare(SCPlayer o1, SCPlayer o2) {
                return Integer.compare(o1.point,o2.point);
            }
        });
    }
}
