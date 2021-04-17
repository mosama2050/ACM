/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

import java.util.Scanner;

/**
 *
 * @author SMSM
 */
public class L_MakeMeHappy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine().replace(" ", "");
        char s[] = in.nextLine().replace(" ", "").toCharArray();
        boolean b = true;
        for (int i = 0; i < s.length; i++) {
            if (!line1.contains(s[i] + "")) {
                b = false;
                break;
            } else {
                line1 = line1.replaceFirst(s[i] + "", "");
            }

        }
        System.out.println(b ? "YES" : "NO");
    }

}
