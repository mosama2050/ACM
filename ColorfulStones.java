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
public class ColorfulStones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();
        String s2 = in.next();
        int x = 0;
//R R R B G B R B B B
//B B B R R
        for (int i = 0; i < s2.length(); i++) {

            if (s2.charAt(i) == s.charAt(x)) {
                x++;
            }

        }

        System.out.println(x + 1);
    }
}
