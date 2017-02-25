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
public class StaircaseAlgos {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int inputSize = sc.nextInt();
        for(int i = 1 ; i <= inputSize ; i++){
            for(int j = 1 ; j <= inputSize - i ; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
