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
public class HelpfulMaths {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.next();
        String[] a = x.split("\\+");
        Arrays.sort(a);
        String out = new String();
        for (int i = 0; i < a.length; i++) {
            out += a[i];
            if (i + 1 != a.length) {
                out += '+';
            }
        }
        System.out.println(out);

    }
}
