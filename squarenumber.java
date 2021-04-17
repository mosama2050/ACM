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
public class squarenumber {

//1 4  2  1 2 
//1 10 3  1 2 3 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, count = 0;
        while (true) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x + y == 0) {
                break;
            }
            for (int i = x; i <= y; i++) {
                if (i*i <= y){
                count++;}
            }

            System.out.println(count);
            count=0;
        }
    }
}
