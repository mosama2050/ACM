/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm;

import java.util.Scanner;

/**
 *
 * @author Nitro
 */
public class luckynumber {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int x = sc.nextInt();
          int y = sc.nextInt();
          int count = 0 ;
          for (int i = x; i <=y; i++) {
              if(i<=4 ){
              count+=4;
              }else 
              count+=7;
        }
          System.out.println(count);
    }
}
