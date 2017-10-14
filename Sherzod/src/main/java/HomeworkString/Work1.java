package HomeworkString;

import java.util.Scanner;

/**
 * Created by Sherzod on 14/10/2017.
 */
public class Work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt()+5;
        }
        for (int i = 0; i < n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
