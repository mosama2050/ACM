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
public class laptops {
    public static void main (String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
//1 2
//2 1
		for(int i=0; i<n; i++){
			if(in.nextInt()<in.nextInt()){
				System.out.println("Happy Alex");
				return;
			}
			
		}
		System.out.println("Poor Alex");
	}
}
