package Homework;

import java.util.Scanner;

/**
 * Created by Sherzod on 13/10/2017.
 */
public class Work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ferst,second;
        ferst = scanner.nextLine();
        second = scanner.nextLine();
        if(ferst.toLowerCase().equals(second.toLowerCase())){
            System.out.println("Bir xil");

        }else {
            System.out.println("Xar xil");
        }
    }
}
