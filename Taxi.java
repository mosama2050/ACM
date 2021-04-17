/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

/**
 *
 * @author osama
 */
import java.util.Scanner;

public class Taxi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int group = in.nextInt();
        long[] a = new long[100];

        for (int i = 0; i < group; i++) {

            a[in.nextInt()]++;

        }
        a[1] = Math.max(0, a[1] - a[3]);
        System.out.println(a[4] + a[3] + (a[1] + a[2] * 2 + 3) / 4);

    }
}