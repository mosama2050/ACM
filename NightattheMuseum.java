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
public class NightattheMuseum {
    public static void main(String[] args) {
        	Scanner in = new Scanner(System.in);
		String s = in.next();
		int sum = 0;
		char c = 'a';
		for(int i = 0; i < s.length(); i++)
		{
			sum += Math.min(26-Math.abs(s.charAt(i)-c), Math.abs(s.charAt(i)-c));
			c = s.charAt(i);
		}
		System.out.println(sum);
    }
}
