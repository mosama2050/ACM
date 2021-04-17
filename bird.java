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
public class bird {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int arr[] = new int[x + 1];

        for (int i = 1; i <= x; i++) {
            arr[i] = in.nextInt();
        }
      
        int numbull = in.nextInt();
        for (int i = 1; i <= numbull; i++) {
            int s = in.nextInt(), n = in.nextInt();

            int l = n - 1;
            int r = arr[s] - n;
            arr[s] = 0;
            arr[s - 1] += l;
            arr[s + 1] += r;

        }  System.out.println("a7a");

        for (int i = 1; i <= arr.length-1; i++) {
            System.out.println(arr[i]);
        }
    }

}
