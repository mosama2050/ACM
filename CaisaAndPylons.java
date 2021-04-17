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
public class CaisaAndPylons {

    public static void main(String[] args)  {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

