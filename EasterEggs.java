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
public class EasterEggs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = "ROYGBIV";
        for (int i = 7; i < n; i++) {
            
                    s += s.charAt(s.length() - 4);
        }
        System.out.println(s);
    }
}
