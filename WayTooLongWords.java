package ACM;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author osama
 */
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ss = "";
        
        for (int i = 0; i < n; i++) {
            ss=sc.next();
            System.out.println((ss.length()>10)?""+ss.charAt(0)+(ss.length()-2)+ss.charAt(ss.length()-1):ss);
            
        }
    }
}
