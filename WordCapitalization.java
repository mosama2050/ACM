/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

/**
 *
 * @author osama
 */import java.util.*;

public class WordCapitalization{
	public static void main(String[] args){
          Scanner in =  new Scanner(System.in);
		String a = in.next();
		System.out.println((a.charAt(0)+"").toUpperCase() + a.substring(1));
	}
}