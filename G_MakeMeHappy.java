package ACM;

import java.util.Arrays;
import java.util.Scanner;

public class G_MakeMeHappy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int len = in.nextInt();
            int x = in.nextInt();
            int arr[] = new int[x];
            for (int j = 0; j < x; j++) {
                 arr[j] = in.nextInt();
            }
            Arrays.sort(arr);
//            for (int j = 0; j < x; j++) {
//                System.out.print(arr[j] + " ");
//            }
//            System.out.println(" ");
            for (int j = 0; j <x; j++) {
                while (len>=arr[x-1-j]&&len>=0) {
                    len-=arr[x-1-j];
                  //  System.out.println("len =" +len);
                   
                    } if(len == 0) {
                        System.out.println("YES");
                        break;
   
                }
            }if(len>0)System.out.println("NO"); 
             
        }
      
    }

}

//import java.util.*;
//import java.lang.*;
//
//class Main
//{
//	public static void main (String[] args) throws java.lang.Exception
//	{
//		      Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int i = 0; i < n; i++) {
//            int len = in.nextInt();
//            int x = in.nextInt();
//            int arr[] = new int[x];
//            for (int j = 0; j < x; j++) {
//                 arr[j] = in.nextInt();
//            }
//            Arrays.sort(arr);
////            for (int j = 0; j < x; j++) {
////                System.out.print(arr[j] + " ");
////            }
////            System.out.println(" ");
//            for (int j = 0; j <x; j++) {
//                while (len>=arr[x-1-j]&&len>=0) {
//                    len-=arr[x-1-j];
//                  //  System.out.println("len =" +len);
//                   
//                    } if(len == 0) {
//                        System.out.println("YES");
//                        break;
//   
//                }
//            }if(len>0)System.out.println("NO"); 
//             
//        }
//      
//    }
//	}
