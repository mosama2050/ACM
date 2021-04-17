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
public class VasyaandChocolate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x, s, a, b, c, t , num ;
        x = in.nextInt();
        for (int i = 0; i < x; i++) {
            s = in.nextInt();
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            num = s / c;
            System.out.println(num+ num / a * b);
        }
    }
}
