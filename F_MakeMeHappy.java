package ACM;

import java.util.Scanner;

public class F_MakeMeHappy {
// 6   1 6 2 5 3 4 
// 7   1 7 2 6 3 5 (4)    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n / 2; i++) {
            System.out.print(i + " ");
            System.out.print((n - i + 1) + " ");

        }
        if (n % 2 == 1) {
            System.out.println(n / 2 + 1);
        }

    }
}
