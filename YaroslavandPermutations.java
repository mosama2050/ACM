/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author osama
 */
public class YaroslavandPermutations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = new int[1001];
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            a[in.nextInt()]++;
        }
        Arrays.sort(a);
        if (a[1000] > (n + 1) / 2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
