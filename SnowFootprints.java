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
public class SnowFootprints {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int r = s.indexOf("R");
        int l = s.indexOf("L");
        if (r != -1 && l != -1) {
            System.out.println((r + 1) + " " + l);
        } else {
            if (r == -1) {
                int y = s.lastIndexOf("L");
                System.out.println((y + 1) + " " + (l));
            }
            if (l == -1) {
                int y = s.lastIndexOf("R");
                System.out.println((r + 1) + " " + (y + 2));
            }
        }

    }
}
