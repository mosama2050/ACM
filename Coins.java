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


public class Coins {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            String  s = in.next();
            if ( s.contains(">")) {
                arr[ s.charAt(0) - 'A']++;
            } else {
                arr[ s.charAt(2) - 'A']++;
            }
        }

        char[]  ss = new char[3];
        for (int i = 0; i < 3; i++) {
                ss[arr[i]] = (char) (i + 'A');
        }

        if (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
            System.out.println("Impossible");
        } else {
            String sss=new String(ss);
            System.out.println(sss);
        }

    }

}

