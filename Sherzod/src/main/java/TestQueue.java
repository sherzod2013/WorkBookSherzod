import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Sherzod on 12/10/2017.
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue<String>  strings = new LinkedList<String>();
        for (int i = 0; i < 2; i++) {
            strings.add("i="+i);
        }
        Collection collection = new ArrayList();
        collection.add("Alo");
        collection.add("Sallom");
        collection.add("Hello");
        collection.add("Zdrasti");
        collection.add(1);
        strings.addAll(collection);

        System.out.println(strings);
    }
}
