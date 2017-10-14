/**
 * Created by Sherzod on 14/10/2017.
 */
import java.util.*;
public class Compere {

        public static void main (String[] args)
        {
            List<Integer>list = new LinkedList<Integer>();
            System.out.println(System.currentTimeMillis());
            for (int i=0; i <=10000;i++)
            {
                list.add(new Integer(i));
            }
            System.out.println(System.currentTimeMillis());
            System.out.println("z");
            List<Integer> p = new ArrayList<Integer>();
            System.out.println(System.currentTimeMillis());
            for (int i=0; i <=10000;i++)
            {p.add(new Integer(i));
            }
            System.out.println(System.currentTimeMillis());
            System.out.println("z");
            TreeSet<Integer> p1 = new TreeSet<Integer>();
            System.out.println(System.currentTimeMillis());
            for (int i=0; i <=10000;i++)
            {
                p1.add(new Integer(i));
            }
            System.out.println(System.currentTimeMillis());
            System.out.println("z");
            HashSet<Integer> p2 = new HashSet<Integer>();
            System.out.println(System.currentTimeMillis());
            for (int i=0; i <=10000;i++)
            {
                p2.add(new Integer(i));
            }
            System.out.println(System.currentTimeMillis());
            System.out.println("z");
            System.out.println(System.currentTimeMillis());
            for (int i=0; i <=10000;i++)
            {
                list.contains(new Integer(i));
            }
            System.out.println(System.currentTimeMillis());
            System.out.println("z");
            System.out.println(System.currentTimeMillis());
            for (int i=0; i <=10000;i++)
            {
                p.contains(new Integer(i));
            }
            System.out.println(System.currentTimeMillis());
            System.out.println("z");
            System.out.println(System.currentTimeMillis());
            for (int i=0; i <=10000;i++)
            {
                p1.contains(new Integer(i));
            }
            System.out.println(System.currentTimeMillis());
            System.out.println("z");
            System.out.println(System.currentTimeMillis());
            for (int i=0; i <=10000;i++)
            {
                p2.contains(new Integer(i));
            }
            System.out.println(System.currentTimeMillis());
            System.out.println("z");
            System.out.println(System.currentTimeMillis());
            for (int i=0; i <=10000;i++)
            {
                list.remove(new Integer(i));
            }
            System.out.println(System.currentTimeMillis());
            System.out.println("z");
            System.out.println(System.currentTimeMillis());
            for (int i=0; i <=10000;i++)
            {
                p.remove(new Integer(i));
            }
            System.out.println(System.currentTimeMillis());
            System.out.println("z");
            System.out.println(System.currentTimeMillis());
            for (int i=0; i <=10000;i++)
            {
                p1.remove(new Integer(i));
            }
            System.out.println(System.currentTimeMillis());
            System.out.println("z");
            System.out.println(System.currentTimeMillis());
            for (int i=0; i <=10000;i++)
            {
                p2.remove(new Integer(i));
            }
            System.out.println(System.currentTimeMillis());
            System.out.println("z");
        }
    }
