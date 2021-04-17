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
public class SumOfDigiT {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int ans = 0;
        while (s.length() != 1) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {

                sum += (char) (s.charAt(i) - '0');
            }
            s = sum + "";
            ans++;
        }
        System.out.println(ans);
    }
}
