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
public class BearandFindingCriminals {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        int arr[] = new int[n];
        int num = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        //1 2 3 4 5     6 7 8 9 9
        if (arr[h - 1] == 1) {

            num++;
        }

        if (h-1 <=(n - h)) {
            System.out.println("here");
            for (int i = 0; i < (h - 1) * 2; i++) {

                if (arr[i] == 1 && arr[((h - 1) * 2) - i] == 1) {
                    num ++;

                }
            }

            for (int i = ((h - 1) * 2) + 1; i < arr.length; i++) {
                if (arr[i] == 1) {

                    num++;
                }
            }
        } else {
            // 1 2 3    4 5 6 7 8 9 9
            System.out.println("ymeen el nos");
            for (int i = (h-1) - (arr.length - h); i <h-1; i++) {
          int j =1 ; 
             if (arr[i] == 1 && arr[arr.length - j] == 1) {
                    
                    num++; 
                   
                }
               j--;
            }
            for (int i = 0; i < (h-1) - (arr.length - h); i++) {
                
                if (arr[i] == 1) {
                    
                    num++;
                }
            }
        }

        System.out.println(num);

    }
}
