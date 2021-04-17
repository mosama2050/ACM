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
public class plusmins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = 0, maxx = 0, mini = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                x++;
            } else {
                x--;
            }
            maxx = Math.max(maxx, x);
            mini = Math.min(mini, x);
        }
        System.out.println(maxx - mini);
    }
}
