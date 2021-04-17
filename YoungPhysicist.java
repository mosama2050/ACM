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
public class YoungPhysicist {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /**int a=0,b=0,c=0;
        int arr [] =new int [3*n];
        for (int i = 1; i <= 9; i++) {
            if(i==1|i==4|i==7)
                a+=sc.nextInt();
            else if (i==2|i==5|i==8)
                b+=sc.nextInt();
            else
                 c+=sc.nextInt();
        }
        System.out.println(a +"" +b+""+c );
        System.out.println((a==b&&b==c)?"YES":"NO");*/
        int x=0,y=0,z=0;
        for(int i=0;i<n;i++){
            x+=sc.nextInt();
            y+=sc.nextInt();
            z+=sc.nextInt();
        }
        System.out.println((x==y&&y==z)?"YES":"NO");
    }
}
