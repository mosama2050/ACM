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
public class PetyaandCountryside {
    public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr [] = new int [n];
        int num = 1 ; 
        for (int i = 0; i < n; i++) {
            arr [i] = in.nextInt();
          
                
        }
        for (int i = 1; i <n; i++) {
              if(arr[i-1]<=arr[i])
                  num ++;
              else num=1 ; 
        }
        
        System.out.println(num);
        
        
            
       
    
    }
}
