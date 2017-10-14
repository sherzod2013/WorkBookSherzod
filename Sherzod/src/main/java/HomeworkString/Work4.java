package HomeworkString;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Scanner;

/**
 * Created by Sherzod on 14/10/2017.
 */
public class Work4 {
    public static void main(String[] args) {
        String number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextLine();
        int count=0;
        for (int i = 0; i < number.length(); i++) {
            if(number.charAt(i)-'0'==3){
                count++;
            }
        }
        System.out.println(count);
    }
}
