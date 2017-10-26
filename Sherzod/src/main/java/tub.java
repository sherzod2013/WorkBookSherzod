import java.util.ArrayList;
import java.util.Scanner;


public class tub {
    public static void main(String[] args) {
        String kalit = "DH", b = "", c = "";
        Scanner sc = new Scanner(System.in);
        String soz = "Xavfsizlik texnikasi mehnat qilish uchun xavfsiz sharoit yaratishga qaratilgan. Chora tadbirlar sistemadan iborat. Korxona va ustaxonalarda kompyuterni orqasida kabel yoki simlarni tiokga ulayotganda tok urishi mumkin. Kompyuterlarning ishga yaroqligi tekshirib turiladi. Elektr simlarga simchalar osmaslik lozim, aks holda qisqa tutashuv berishi mumkin. Simlarda nuxson sezilsa elektromantyorga xabar berish, ochilib qolgan simlarga q’ol tekkazmaslik kerak. Kompyuter oldiga ho’l holda o’tirib bo’lmaydi.";
        System.out.println("Matini matinga yashirish uchun 1 ni bosing, yashirilgan ma`lumoni olish uchun 2 ni bosing : ");
        int w = sc.nextInt(

        );
        if (w == 1) {

            System.out.println("Yashiriladigan so'zni kiriting <-:");
            kalit = sc.next();


            soz.trim();

            while (soz.indexOf("  ") > -1) {
                soz = soz.replace("  ", " ");
            }
            char a[] = new char[1100];

            for (int i = 0; i < kalit.length(); i++) {
                a[i] = kalit.charAt(i);
                b += ikki((int) a[i]);
            }
            char tt[] = new char[11111111];
            for (int i = 0; i < b.length(); i++) {
                tt[i] = b.charAt(i);
            }
            int indexs = 1, t = 0, j = 0;
            String[] mas = soz.split(" ");
            while (indexs > 0) {
                indexs = soz.indexOf(" ", indexs + 1);
                j++;
            }
            if (j > b.length()) {
                for (int i = 0; i < mas.length; i++) {
                    if (tt[i] == '1')
                        mas[i] += "  ";
                    else mas[i] += " ";

                    c += mas[i];

                }
                c = c.trim();
            } else System.out.println("Matinda probellar yetarli emas");
            System.out.println(c);
        } else {
            Scanner sc1=new Scanner(System.in);
            System.out.println("Shifirlangan mattinni kiriting :");
            String c1=sc1.nextLine();
            String aaa = decode(c1);
            System.out.println("Yashirilgan malumot :-> "+ otkiz(aaa));
        }

    }



//Todo: Funksia .

    public static String decode(String ss){
        char s11[]=new char[111111111];
        char s22[]=new char[111111111];

        String natija="";
        int t=0;
        for (int i = 0; i < ss.length(); i++) {
            s11[i]=ss.charAt(i);
        }
        for (int i = 1; i < ss.length()-1; i++) {

            if (s11[i] == ' ' && s11[i + 1] == ' ') {s22[t]= '1';t++;}
            if (s11[i] == ' ' && s11[i + 1] != ' ' && s11[i -1] != ' ') {s22[t]= '0';t++;}

        }
        t=7*(t/7);
        for (int i = 0; i <t; i++) {
            natija+=s22[i];
        }

        return natija;

    }

    public  static String  otkiz(String aaa){
        String nat="";
        char m[]=new char[111111];
        for (int i = 0; i < aaa.length(); i++) {
            m[i]=aaa.charAt(i);
        }
        int t1=0,l=0;
        long s12=0;
        char q[]=new char[1111];


        for (int i = aaa.length()-1; i >=0 ; i--) {

            if(m[i]=='1'){s12+=Math.pow(2,t1);}
            t1++;
            if(t1==7){t1=0;
                q[l++]=(char)s12;s12=0;}
        }
        for (int i =l-1;i>=0; i--) {
            nat += q[i];
        }
        return nat;

    }

    public static long ikki(int a){
        long s=0,k=1;
        while (a>0){
            s+=a%2*k;
            k=k*10;
            a/=2;
        }

        return s;
    }
}
