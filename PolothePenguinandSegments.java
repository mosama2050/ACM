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
public class PolothePenguinandSegments {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += -in.nextInt() + in.nextInt() + 1;
        }
        System.out.println(ans % k == 0 ? 0 : k - ans % k);
    }
}
