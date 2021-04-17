/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

import java.util.Scanner;

/**
 *
 * @author osama
 */
//code ebn ... :(
public class PanoramixsPrediction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
      
        int i = 0;
        for (i = x + 1; i <= y; i++)  
            if (prim(i) == true) 
                break;
            

                if(i==y)
		System.out.println("YES");
		else
		
		System.out.println("NO");
		
    }
 

    private static boolean prim(int x) {
        boolean b = true;

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                b = false;
                break;
            }
        }

        return b;

    }
}
/*
import java.math.BigInteger;
import java.util.*;

public class PanoramixsPrediction {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger big = BigInteger.valueOf(sc.nextInt());
        System.out.println(big.nextProbablePrime().equals(BigInteger.valueOf(sc.nextInt())) ? "YES" : "NO");
    }

}
*/