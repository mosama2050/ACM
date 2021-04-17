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
public class Twins {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int sumt = 0;
        int sum = 0;
        int ans = 0;
        int arr[] = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = in.nextInt();
            sumt += arr[i];
        }
        Arrays.sort(arr);

        for (int i = l - 1; i >= 0; i--) {
            sumt = sumt - arr[i];
            sum = sum + arr[i];
           ans++;
            if (sum > sumt) {
                break;
            }
        }
        System.out.println(ans);

    }
}
