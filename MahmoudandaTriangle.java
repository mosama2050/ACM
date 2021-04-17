
package ACM;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author osama
 */
public class MahmoudandaTriangle {

    public static void main(String[] o) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] =in.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < n - 2; i++) {
            if (a[i] + a[i + 1] > a[i + 2]) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
