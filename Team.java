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
public class Team {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int n=in.nextInt(),sum=0;
        for(int i=0;i<n;++i){
            sum+=( ( ( in.nextInt() + in.nextInt() + in.nextInt() ) > 1 )? 1 : 0 );
        }
        System.out.println(sum);
    }
}
