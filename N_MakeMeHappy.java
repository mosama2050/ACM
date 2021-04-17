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
public class N_MakeMeHappy {
//4
//3 2 1 2     2312       2132   2123   1223
// 1 2 2 3    
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
