/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author osama
 */
public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
         Scanner in=new Scanner (System.in);
        
         HashSet s =new HashSet();
       
        for (int i = 0; i < 4; i++) {
            s.add(in.nextInt());
        }
       
    
        System.out.println(4-s.size());
    }
}
