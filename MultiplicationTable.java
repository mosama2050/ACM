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
public class MultiplicationTable {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        for (int i = 1; i < k; i++) {
            for (int j = 1; j < k; j++) {
                System.out.printf("%s ", Integer.toString(i * j, k));
            }

            System.out.println();
        }
    }
}
