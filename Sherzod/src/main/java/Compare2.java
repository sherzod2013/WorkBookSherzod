import java.util.*;

/**
 * Created by Sherzod on 14/10/2017.
 */
public class Compare2 {
    public static void main(String[] args) {

        System.out.println("------------Linked list--------------");
        List<Integer> list = new LinkedList<Integer>();
        long timeBefor=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        long timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter-timeBefor);

        System.out.println("---------Array list----------");
        List<Integer> list2 = new LinkedList<Integer>();
        timeBefor = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list2.add(i);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter-timeBefor);

        System.out.println("---------Set-----------");
        Set<Integer> list3 = new HashSet<Integer>();
        timeBefor = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list3.add(i);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter-timeBefor);

        System.out.println("---------TreeSet-----------");
        TreeSet<Integer> list4 = new TreeSet<Integer>();
        timeBefor = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list4.add(i);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter-timeBefor);

        System.out.println("---------LinkedList contains-----------");
        timeBefor = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.contains(i);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter-timeBefor);

        System.out.println("---------ArrayList contains-----------");
        timeBefor = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list2.contains(i);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter-timeBefor);
    }
}
