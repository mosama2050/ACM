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
public class Isyourhorseshoe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<Integer>();
       
       
        for (int i = 0; i < 4; i++) {
            
            hashSet.add(in.nextInt());
        }
       
        System.out.println( 4 - hashSet.size());
    }
}
