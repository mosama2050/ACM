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
public class xor {
    public static void main(String[] args) {
        
             Scanner in = new Scanner(System.in);
     int n =in.nextInt();
      int a [] = new int [n];
      int b [] = new int [n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
           
        }
        for (int i = 0; i < n; i++) {
           b[i]=in.nextInt();
           
        }int mid = n/2 ; 
        System.out.println("a7a" +( 12^12));
        for (int i = 0; i <= mid; i++) {
            
            System.out.print((a[i]^b[mid-i] )+ " ");
            
        }for (int i = n; i > mid; i--) {
            System.out.print((a[i]^b[mid+i] )+ " ");
            
        }
        
        
    }
}
