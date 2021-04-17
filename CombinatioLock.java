package ACM;

import java.util.Scanner;

/**
 *
 * @author SMSM
 */
public class CombinatioLock {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String s1 = in.next();
        String s2 = in.next();
        int ans = 0, mine;

        for (int i = 0; i < x; i++) {
            mine = Math.abs((int) s1.charAt(i) - (int) s2.charAt(i));
            ans += Math.min(mine, 10 - mine);
        //    System.out.println(ans);
        }

        System.out.println(ans);
    }
}
