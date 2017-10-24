package Homework3.Work1;

/**
 * Created by Sherzod on 10/20/2017.
 */
public class A1 {
    static int count = 0;


    public  int getCount() {
        return count;
    }

    public  int inkrem() {
        return count++;

    }

    public  void setPerent() {
        B1 b1 = new B1();
    }

    public static class B1 {

        public B1() {
            count++;
        }


        public  void getChildCount() {
            System.out.println(count);
        }
    }
}

