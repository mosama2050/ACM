/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;


import java.util.*;

/**
 *
 * @author osama
 */
public class Decoding {
//logva
//volga     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String s = in.next();
        String out = "";
        
        if (x % 2 != 0) {
            out = out + s.charAt(0);
            for (int i = 1; i < x; i += 2) { 
                char L = s.charAt(i);
                char R= s.charAt(i + 1);
                out = L+ out + R;
                
               
            }
        } else {

            for (int i = 0; i < x; i += 2) {
                char L= s.charAt(i);
                char R= s.charAt(i + 1);
                out = L+ out + R;
                System.out.println(out);
            }
        }
        System.out.println(out);
    }
    
}
