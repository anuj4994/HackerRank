/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms.warmup;

import java.util.Scanner;

/**
 *
 * @author Anuj Shah
 */
public class SolveMeFirstAlgos {
    static int solveMeFirst(int a, int b) {
         // Hint: Type return a+b; below 
        return a+b;
   }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
   }
}
