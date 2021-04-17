package ACM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author osama
 *///1234            32                32               2
// 4   322
// 6   53
// 8   7222
// 9   7332
//
public class C {

    static int L = 0;
    static ArrayList a = new ArrayList();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();
        int x = 0;
        for (int i = 0; i < s.length(); i++) {
            x = s.charAt(i) - '0';
            if (x > 1) {
                c(x);
            }
        }
        Collections.sort(a);
        System.out.println(a);
    }

    private static int fact(int i) {
        if (i == 1 || i == 0) {
            return 1;
        } else {
            return i * fact(i - 1);
        }
    }
//362880

    private static void c(int x) {

        if (x == 2 || x == 3 || x == 5 || x == 7) {
            a.add(x);
        } else {
            for (L = 7; L > 2; L -= 2) {
                if (fact(x) % fact(L) == 0) {
                    a.add(L);
                    //System.out.println("i===" + L);
                    break;
                }
            }
        
   //     System.out.println("here" + fact(x) / fact(L));
        if (fact(x) / fact(L) == 8|fact(x) / fact(L) == 4|fact(x) / fact(L) == 6) {
            d8(fact(x) / fact(L));
        } else {
            d9(fact(x) / fact(L));
        }

    }}

    private static void d8(int x) {
        int i = 0;
        while (x >=2) {
if(x%3==0){
a.add(3);
break;}
else
{
                    i=2;
               
                
                    a.add(i);
                    
                    //System.out.println("iiiifor 4 8 " + i);
                    x = x / i;
                   


}
        }
    }

    private static void d9(int x) {
        int i = 0;
        while (x > 0) {

            for (i = 2; i < 7; i++) {
                if (x % fact(i) == 0) {
                    a.add(i);
                    i = 2;
                //    System.out.println("iiii" + i);
                    x = x / i;
                }
            }

            break;

        }
    }
}
