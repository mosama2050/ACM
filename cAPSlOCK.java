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
public class cAPSlOCK {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
		String s = in.nextLine(); 
		char c = s.charAt(0);   // awel char 
		s = s.substring(1);     //-msm   ||    -MSM

		if(s.toUpperCase() == s) {        
			s = s.toLowerCase();
			if(Character.toUpperCase(c) == c) 
				c = Character.toLowerCase(c);
			else
				c = Character.toUpperCase(c);
		}
		System.out.println(c + s);
	}

}
