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
public class MagicForest {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int ans=0;
		for(int i=0;i<n;i++){
			for(int b=i;b<=n;b++){
				int c=i^b;
				if(b<=c && c<=n && i+b>c){
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
