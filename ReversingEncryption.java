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
public class ReversingEncryption {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                String s1 = "";
                for (int j = 0; j < i; j++) {
                    s1 = s.charAt(j) + s1;
                }
                s = s1 + s.substring(i);
            }
        }
        System.out.println(s);
    }
}
