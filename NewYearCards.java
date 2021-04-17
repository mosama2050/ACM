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
public class NewYearCards {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int arr[][] = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        /////////////////////////////////
        for (int i = 1; i <= n; ++i) {
            arr[0][i] = sc.nextInt();
        }
        for (int i = 1, j, k; i <= n; ++i) {
            for (j = 1;; ++j) {
                if (arr[i][j] != i) {
                    for (k = 1; arr[0][k] > arr[i][j] || arr[0][k] == i; ++k);
                    if (arr[0][k] == arr[i][j]) {
                        break;
                    }
                }
            }
            System.out.print(arr[i][j] + " ");
        }
    }
}
