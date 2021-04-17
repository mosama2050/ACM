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
public class mishka {

    public static void main(String[] args) {
//  8  4
//  4 2 3 1       5 1 6      4
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int i;
        for (i = 0; i < n && a[i] <= k; i++) {
            count++;
        }
        for (int j = n - 1; a[j] <= k && j > i; j--) {
            count++;
        }
        System.out.println(count);
    }
}

