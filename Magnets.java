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
public class Magnets {
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
                int count =0 , Nnum=0 , Onum =0 ;
		
		
		      for (int i = 0; i <n ; i++) {
       
			Nnum=in.nextInt();
			if (Nnum!=Onum)count++;
			Onum=Nnum;
		}

		System.out.println(count);			


	}
    }

