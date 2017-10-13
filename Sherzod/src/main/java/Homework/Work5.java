package Homework;

import java.util.Scanner;

/**
 * Created by Sherzod on 13/10/2017.
 */
public class Work5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ferst, second;
        ferst = scanner.nextLine();
        second = scanner.nextLine();
        int k=0;
        for (int i = 0; i < ferst.length(); i++) {
            if(ferst.charAt(i)==second.toLowerCase().charAt(i)){
                k++;
            }else{
                if(ferst.toLowerCase().charAt(i)==second.charAt(i))
                    k++;
            }

        }
        if(ferst.length()==k){
            System.out.println("Bir xil");
        }else{
            System.out.println("Xar xil");
        }

    }
}
