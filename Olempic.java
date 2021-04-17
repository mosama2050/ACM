/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author osama
 */
public class Olempic {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int n = in.nextInt();
          int x = n ; 
          int m ;
          
          int arr[] = new int [n];  int count=0;
          for (int i = 0; i < n; i++) 
            arr[in.nextInt()]++;
        
          for (int i = 1; i < n; i++) {
        
              if(arr[i]>=1){
                  count ++ ;} 
                  }
          System.out.println(count);
          
          
          
          
          
          HashSet sh = new HashSet();
           for (int i = 0; i < n; i++) {
              m= in.nextInt();
               if(m>0)
            sh.add(m);
             
           }
           
           System.out.println(sh.size());
        
    }
    
}
