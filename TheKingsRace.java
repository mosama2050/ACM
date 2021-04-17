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
//4 
//2 3
public class TheKingsRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long s = in.nextLong();
        long x = in.nextLong();
        long y = in.nextLong();
      System.out.println((s-x)+(s-y) >= (x-1)+(y-1)? "White" : "black");

//        if ((x - w1) + (y - w2) <= ( b1-x) + ( b2-y)) {
//            System.out.println("White");
//        } else {
//            System.out.println("Black");
//        }
    }
}
/*
#include<bits/stdc++.h>
using namespace std;


int main(){
long long n , x ,y ;
    cin>>n>>x>>y
   cout<<((hypot(x-1 , y-1)<=hypot(n-x , n-y))?"White":"Black");
}
 */
