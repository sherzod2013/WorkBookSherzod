package HomeworkString;

import java.util.Scanner;

/**
 * Created by Sherzod on 14/10/2017.
 */
public class Work5 {
    public static void main(String[] args) {


        int number;
        Scanner scanner  =new Scanner(System.in);
        number = scanner.nextInt();
        int a = 0;
        if(divideToTwo(number)){
            System.out.println("Raqamlar qig`indisi = "+ numberSum(number));
            a++;
        }
        if(divideToTree(number)){
            System.out.println("Raqamlar soni = "+numberLength(number));
            a++;
        }
        if(divideToFive(number)) {
            System.out.println("0 raqamlari soni = "+ numberOfZero(number));
            a++;
        }
        if(a==0){
            System.out.println("No");
        }

    }
    public static boolean divideToTree(int number){
        if(number%3==0){


            return true;
        }
        return false;
    }

    private static int numberLength(int number) {
       String s = String.valueOf(number);
        return s.length();
    }

    public static boolean divideToTwo(int number){
        if(number%2==0){

            return true;
        }

        return false;
    }

    private static int numberSum(int number) {
        int result=0;
        while (number!=0){
            result+=number%10;
            number/=10;
        }
        return result;
    }

    public static boolean divideToFive(int number){
        if(number%5==0){

            return true;
        }
        return false;
    }

    private static int numberOfZero(int number) {
        String a  = String.valueOf(number);
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='0'){
                count++;
            }
        }
        return count;
    }

}
