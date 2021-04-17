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
public class  Translation   {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
       String  s1 =in.next();
       String  s2 =in.next();
       boolean g =true;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(s2.length()-i-1))
                g=false;
        }
        System.out.println((g==true)?"YES":"NO");
    }
}
