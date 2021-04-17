/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm;

import java.util.Arrays;
import java.util.Scanner;

public class Serejaownsarestaurant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i < m && i < n; i++) {
            ans += a[i];
        }
        if (n < m) {
            ans -= (m - n) * d;
        }
        System.out.println(ans);
    }
}
