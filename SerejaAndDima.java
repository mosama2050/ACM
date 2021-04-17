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
public class SerejaAndDima {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     //   int n = in.nextInt();
   //     int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = in.nextInt();
//        }

        int arr[] = {4,1,2,10};
        int l = 0;
        int r = 4 - 1;
        int sum = 0;
        int s = 0, d = 0;
//4 1 2 10
//12 5        
        for (int i = 0; i < 4; i++) {
            if (arr[l] >= arr[r]) {
                sum = arr[l];
                l++;
            } else {
                sum = arr[r];
                r--;
            }
            if (i % 2 == 0) {
                s += sum;
            } else {
                d += sum;
            }
        }

        System.out.println(s + " " + d);
    }
}
