/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author osama
 */
public class ProtectSheep {
    public static void main(String[] args) {
             Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      int m =in.nextInt();
             char [][] a = new char [n][m];
             for (int i = 0; i < n; i++) {
                 for (int j = 0; j < m; j++) {
                
                     a[i][j]=in.next().charAt(0);
                 }
                 }
                    for (int i = 0; i < n; i++) {
                 for (int j = 1; j < m; j++) {
                 if(a[i][j]=='S'&&a[i][j+1]=='.'&&a[i][j-1]=='.'){
                     a[i][j+1]='D';
                      a[i][j-1]='D';
                      System.out.println("a7a");
                 }
                 else if ((a[i][j]=='W'&&a[i][j+1]=='.'&&a[i][j-1]=='.')){
                        a[i][j+1]='D';
                        a[i][j-1]='D'; 
                 }
                 else 
                 {
                     System.out.println("NO");
                 break ; }
                     
                 }
                    }
                 
        
        
    }
}
