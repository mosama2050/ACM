/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

import java.util.Scanner;

/**
 *
 * @author SMSM
 */
public class MaximuminTable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
 int x = in.nextInt();
    int arr [][] = new int[10][10];

        for (int i = 0; i < 10; i++) {
            arr[i][0]=1;
            for (int j = 1; j < 10; j++) {
                if(i==0){ arr[i][j]=1;}else{
            arr[i][j]=arr[i-1][j]+ arr[i][j-1];
            }}
            
            
        }
        System.out.println(arr[x-1][x-1]);

    }
    
}
