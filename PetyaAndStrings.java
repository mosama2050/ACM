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
public class PetyaAndStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.next().toLowerCase();
        String y = in.next().toLowerCase();
        int result = x.compareTo(y);
        if (result > 0) 
            result = 1;
        
        if (result < 0) 
            result = -1;
        
        System.out.println(result);

    }
}
