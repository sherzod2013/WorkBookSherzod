package Homework3.Work1;

/**
 * Created by Sherzod on 10/20/2017.
 */
public class A extends B {
    static int count=0;

    public static int getCount() {
        return count;
    }

    public static int inkrem(){
        return count++;

    }
    public static void main(String[] args) {
        setPerent();
        setPerent();
        B.getChildCount();

    }
    public static void setPerent(){
        B b = new B();
    }
}
class B{
    public B() {
        A.inkrem();
    }


    public static void  getChildCount(){
        System.out.println(A.getCount());
    }
}
