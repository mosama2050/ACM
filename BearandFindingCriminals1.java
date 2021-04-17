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
public class BearandFindingCriminals1 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int c= sc.nextInt() - 1;
			int arr[] = new int [n];
			for(int i = 0 ; i  < n ; i++)
			{
				arr[i] = sc.nextInt();
			}
			int sum = 0;
			for(int i = 0; i < n ; i++)
			{
				if(c+i < arr.length && c-i >= 0)
				{
					if(arr[c+i] > 0 && arr[c-i] > 0)
					{
						if(i == 0)
							sum+=arr[c+i];
						else
							sum+=arr[c+i]+arr[c-i];
					}
				}
				else
				{
					if(c+i < arr.length)
						sum+=arr[c+i];
					if(c-i >= 0)
						sum+=arr[c-i];

				}

			}
			
			System.out.println(sum);

}
}
