/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

import java.util.Scanner;

public class FootBall {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);

        String x = sc.next();
        x = x + " ";

        System.out.println((x.contains("0000000") | x.contains("1111111")) ? "YES" : "NO");

    }
}
