package Homework;

import java.util.Scanner;

/**
 * Created by Sherzod on 13/10/2017.
 */
public class Work4 {
    public static void main(String[] args) {
        String unli = "aoeiu";
        String word;
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();

        int k=0;
        word = word.toLowerCase();
        for (int i = 0; i < unli.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if(unli.charAt(i)==word.charAt(j))
                    k++;
            }
        }
        System.out.println(word.length()-k);
    }
}
