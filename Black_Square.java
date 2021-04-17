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
public class Black_Square {
//1 2 3 4                          1 5 3 2
//123214 = 13                      11221
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        String x = in.next();
        int ans = 0;
        for (int i = 0; i < x.length(); i++) {
            ans += a[Integer.parseInt(x.substring(i, i + 1)) - 1];
            System.out.println(">" + a[Integer.parseInt(x.substring(i, i + 1)) - 1]);
        }
        System.out.println(ans);
    }
}
