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

        System.out.println("---------HashSet-----------");
        HashSet<Integer> hashSet = new HashSet<>();
        timeBefor = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            hashSet.add(i);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter-timeBefor);

        System.out.println("--------------HashMap------------");
        HashMap<Integer,User> hashMap  = new HashMap<>();
        timeBefor = System.currentTimeMillis();
        Random random  = new Random();
        for (int i = 0; i < 10000; i++) {
            User user = new User();
            user.setMail("sherzod");
            user.setName("Sherzod");
            user.setId(i+1);
            hashMap.put(i,user);

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

        System.out.println("---------HashSet contains-----------");
        timeBefor = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            hashSet.contains(i);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter-timeBefor);

        System.out.println("--------------HashMap contains------------");
        timeBefor = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
            User user = new User();
            user.setMail("sherzod");
            user.setName("Sherzod");
            user.setId(i+1);
            hashMap.containsKey(i);
            hashMap.containsValue(user);

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

        System.out.println("---------TreeSet contains-----------");
        timeBefor = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list4.contains(i);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter-timeBefor);

        System.out.println("---------Set contains-----------");
        timeBefor = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list3.contains(i);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter-timeBefor);


    }
}
