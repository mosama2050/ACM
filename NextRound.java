/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;
import java.util.Scanner;

public class NextRound
{
	public static void main(String[] args)
	{	
		Scanner in = new Scanner(System.in);
                
		int a= in.nextInt();
		int b= in.nextInt();
		int[] arr = new int[a];
                int count=0;
		for(int i=0;i<a;i++)
		{	
			arr[i]=in.nextInt();
		}
		int x=arr[b-1];
		for(int i=0;i<a;i++)
		{
			if(arr[i]!=0 && x<=arr[i])
			{
				count++;
			}
		}System.out.println(count);
	}
}