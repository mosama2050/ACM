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
//ARR 0007000050000800
//IDX  9 3 15
//ARR[IDX[0]]
public class BurglarAndMatches {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[] = {0,0,0,0,0,0,0,0,0,0,0,0};
        long ans = 0;

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            arr[b] += a;

        }
        for (int i = 10; i > 0; i--) {
            int a = arr[i];
            if (a == 0) {
                continue    ;
            }
            if (a > n) {
                ans += (n) * i;
                n = 0 ; 
                break ; 
            }
            else {
            ans += a*i ; 
            n = n - a; 
            }
           /// System.out.println(a + "   " + n);
        }
        System.out.println(ans);
    }
}
//    public static void main(String[] args) {
//      HashMap<Integer, Integer> hm = new HashMap();
//          Scanner in = new Scanner(System.in);
//           int x = in.nextInt();
//           int n = in.nextInt();
//           int sum = 0  ;
//           for (int i = 0; i < n; i++) {
//               int val =in.nextInt();
//               int key =in.nextInt();
//               
//               hm.put(val, key);
//           }
//          
//           for (int i = hm.size()-1; i >=0; i++) {
//               int y =hm.get(i);
//               
//             if((x-y)>=0){
//                 
//                    sum+=hm.;
//             }
//        }
//            
//        
//          
//    }
//    
//}    
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        int n = in.nextInt();
//        int arr  [] = new int[21];
//        int indx [] = new int[n];
//        int sum = 0;
//        for (int i = 0; i < n; ++i) {
//            
//            int m=in.nextInt();
//            arr[m] = in.nextInt();
//            indx[i]=m;
//        }
//        int ans=0;
//        while(x>0){
//            int mx=0,mdx=0;
//            for(int i=0;i<n;++i){
//                if(arr[ indx[i] ]>mx){
//                    mx=arr[ indx[i] ];
//                    mdx=indx[i];
//                }
//            
//            if(mdx<=x||mdx ==1){
//                x-=mdx;
//                ans+=mdx*mx;
//            }else{
//                ans+=x*mx;
//                x=0;
//             
//              
//            } 
//           
//            if(x<mdx){
//                 break ;
//            
//            }
//           }
//              arr[mdx]=0;
//            
//         
//           
//        }
//        System.out.println(ans);
//    }
//}