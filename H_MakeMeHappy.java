/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

import java.util.Scanner;

public class H_MakeMeHappy {

  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        int limit = in.nextInt();
        int mask = 0, size = 0;
        // 5 5   1001     001       
        // 2
        // 4 5
        StringBuffer sb = new StringBuffer();
        for (int i = limit; i > 0; i--) {
            int bit = Integer.lowestOneBit(i);
            System.out.println("bit" + bit);
            if (bit + mask <= sum) {
                size += 1;
                mask += bit;
                sb.append(i + " ");
            }
        }
        if (mask != sum) {
            System.out.println(-1);
        } else {
            System.out.println(size);
            System.out.println(sb);
        }
    }

}
