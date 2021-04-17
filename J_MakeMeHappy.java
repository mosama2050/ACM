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
 * @author SMSM
 */
public class J_MakeMeHappy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int cout = 0;
        int arr[] = new int[n];
        String arr2[][] = new String[n][n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cout++;
                arr2[i][j] = (arr[i] + " " + arr[j]);
                if (cout == k) {
                    System.out.println(arr2[i][j]);

                    return;
                }
            }

        }

    }

}
