import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Sherzod on 12/10/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger[] integer  = new BigInteger[10];
        for (int i = 0; i < 10; i++) {
            integer[i] = scanner.nextBigInteger();
        }
        BigInteger sum = new BigInteger("0");
        for (int i = 9; i >0 ; i--) {
            for (int j = i; j < 10; j++) {
                sum =sum.add(integer[i].multiply(integer[j]));
                System.out.println(integer[i]+"*"+integer[j]+" va sum = "+sum);
            }

            System.out.println(sum);
            sum = new BigInteger("0");
        }
    }

}
