/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

import java.util.*;

/**
 *
 * @author osama
 */
public class StonesOnTheTable {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String s = sc.next();
        int c = 0;
        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                c++;
            }
        }
        System.out.println(c);
    }
}

