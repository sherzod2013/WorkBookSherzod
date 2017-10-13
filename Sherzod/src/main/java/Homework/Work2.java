package Homework;

import java.util.*;

/**
 * Created by Sherzod on 13/10/2017.
 */
public class Work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ferst, second;
        ferst = scanner.nextLine();
        second = scanner.nextLine();
        Set<String> strings = new HashSet<String>();
        int k = 0;
        for (int i = 0; i < ferst.length(); i++) {
            strings.add(String.valueOf(ferst.charAt(i)));

        }
        k = strings.size();
        for (int i = 0; i < second.length(); i++){
            strings.add(String.valueOf(second.charAt(i)));
        }
        if(strings.size()>k){
            System.out.println("Teng emas");
        }else
            System.out.println("Bir xil");
    }
}