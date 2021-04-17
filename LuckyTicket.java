/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

import java.util.Scanner;

/**
 *
 * @author SMSM
 */
public class LuckyTicket {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int left = 0, right = 0;
       /////// if(!s.matches("[4|7]+")){System.out.println("NO"); return;}
        for (int i = 0; i < n/2; i++) {
            if (s.charAt(i) == '7' | s.charAt(i) == '4' &&s.charAt(n-i-1) == '7' | s.charAt(n-i-1) == '4' ) {
                left += s.charAt(i);
                right += s.charAt(n - i-1);
            } else {
                System.out.println("NO");
                return;
            }

        }
        System.out.println(left == right ? "YES" : "NO");
    }
}
