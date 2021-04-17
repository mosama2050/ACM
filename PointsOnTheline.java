/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

import java.util.*;

/**
 *
 * @author osama
 */
public class PointsOnTheline {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int x =in.nextInt();
                int y =in.nextInt();
                int arr [] = new int [x ];
                for (int i = 0; i <x; i++) {
            arr[i]=in.nextInt();}
            
           Arrays.sort(arr);
              int min = Integer.MAX_VALUE;
              for(int i = 0; i <x; i++){
                     for(int j = i; j <x; j++){
                            if(arr[j] - arr[i] <= y)
                                   min = Math.min(min, x - (j - i + 1));
                     }
              }
              System.out.println(min);
                
                
    }
}
