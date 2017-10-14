package HomeworkString;

import java.util.Scanner;

/**
 * Created by Sherzod on 14/10/2017.
 */
public class Work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i <  n; i++) {
            a[i] = scanner.nextInt();
             sum = a[i];
        }
        System.out.println(sum);
    }
}
