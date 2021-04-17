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
public class Mostafa {
     public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int arr  [] = new int[21];
        int indx [] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            int value = in.nextInt();
            int idx=in.nextInt();
            arr[idx] = value;
            indx[i]=idx;
        }
        int ans=0;
        while(x>0){
            int mx=0,mdx=0;
            for(int i=0;i<n;++i)
                //if(arr[ indx[i] ]>mx){
                    //mx=arr[ indx[i] ];
                    //mdx=indx[i];    
              //  }
                if(indx[i]>mx){
                    mx=indx[i];
                    mdx=i;
                }
            
            //if(mdx<=x){
            //    x-=mdx;
            //    ans+=mdx*mx;
            //}else{
            //    ans+=x*mx;
            //    x=0;
            //}
            if(mx==0)
                break;
            if(arr[mx]<=x){
                System.out.println(arr[mx]+"<"+x+" "+ mx);
                x-=arr[mx];
                ans+=arr[mx]*mx;
            }else{
                System.out.println(arr[mx]+">"+x+" "+ mx);
                ans+=mx*x;
                x=0;
            }
            //arr[mdx]=0;
            indx[mdx]=0;
        }
        System.out.println(ans);
    }
}
