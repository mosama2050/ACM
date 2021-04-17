/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author osama
 */
public class CNasser {
  static ArrayList a = new ArrayList();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x ;
        
        String s = in.next(); 
 
          for (int i = 0; i < s.length(); i++) {
              x = s.charAt(i) - '0';
           
             if (x > 1) {
               if (x == 2 | x == 3|x==5|x==7 ) {a.add(x); }
               else if(x==4){ 
                 a.add(3);
                 a.add(2);
                 a.add(2);
              
            }
               else if(x==6){ 
                 a.add(5);
                 a.add(3);
              
            } else if(x==8){ 
                 a.add(7);
                 a.add(2);
                 a.add(2);
                 a.add(2);
              
            }else if(x==9){ 
                 a.add(7);
                 a.add(3);
                 a.add(3);
                 a.add(2);
              
            }
               
          }
          }
            Collections.sort(a);
           
           System.out.println(a);
        }

    private static int fact(int i) {
if(i==1||i==0)
    return 1; 
else 
    return i *fact(i-1);
    }
    }
