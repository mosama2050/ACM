/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author osama
 */
public class Football_a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int c= 1;
        String a[] = new String[x];
        String s2=""; 
        for (int i = 0; i < x; i++) {
            a[i]=sc.next();
        }
        for (int i = 1; i < x; i++) {
            if(a[i].equals(a[0]))
                c++;
            else
                s2=a[i];
        }
     
           
                System.out.println((c));
        System.out.println((c>(x-c))?a[0]:s2);
    }
}
