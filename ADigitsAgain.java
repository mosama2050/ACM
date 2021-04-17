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
public class ADigitsAgain {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int t = in.nextInt();
       while(t>0){
       int a,b,c = 0;
       c = sumof(c);
       }
      // int x =0;
    }

    private static int sumof(int a) {
     int ret=0;
    while(a>0){
        ret+=a%10;
        a/=10;
    }
        return ret;
}
    }
    

