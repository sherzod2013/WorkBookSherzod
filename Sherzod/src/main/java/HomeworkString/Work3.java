package HomeworkString;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Sherzod on 14/10/2017.
 */
public class Work3 {
    public static void main(String[] args) {
        BigInteger n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextBigInteger();
        Integer sum = 0;

//        System.out.println(n.divide(BigInteger.TEN));
        while (n!=BigInteger.ZERO){
            String bigIntegerValues = n.toString();
            int last = bigIntegerValues.charAt(bigIntegerValues.length()-1)-'0';
//            System.out.println(last);
            sum +=last;
//            System.out.println(sum);
            n=n.divide(BigInteger.TEN);
        }
        System.out.println(sum);
    }
}
