/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author osama
 */
public class Buffer_Scanner {
    public static void main(String[] args) throws IOException {
        InputStreamReader inr = new InputStreamReader(System.in);
        BufferedReader in =new BufferedReader (inr) ;
        StringTokenizer st =new StringTokenizer(in.readLine());
        String s = st.nextToken();
        int x = Integer.parseInt(st.nextToken());
        System.out.println(s +  x );
        
    }
  
}
