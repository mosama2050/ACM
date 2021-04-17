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
public class SequenceFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll(" {2,}", " ")
                .replaceAll(" ,", ",")
                .replaceAll(", ", ",")
                .replaceAll(",", ", ")
                .replaceAll(" \\.\\.\\.", "...")
                .replaceAll("\\.\\.\\. ", "...")
                .replaceAll("\\.\\.\\.", " ...")
                .trim();
        System.out.println(s);
    }
}
