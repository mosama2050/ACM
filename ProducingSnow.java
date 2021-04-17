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
//10 10 5 
// 5 7 2 
// 5 12 4  
public class ProducingSnow { 
    public static void main(String[] args) {
             Scanner in = new Scanner(System.in);
     int n =in.nextInt();
    int b [] = new int [1000];
         int a [][] = new int [2][n];
    
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                
            
            a[i][j]=in.nextInt();
            }
        }int y = 0 ; 
         for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                
           b[y]= a[i][j]-a[1][j];
           y++ ;
            }}
         
         
         
    for(int x : b)
            System.out.print(x + " ");
           
        
        
        
        
    }
}
