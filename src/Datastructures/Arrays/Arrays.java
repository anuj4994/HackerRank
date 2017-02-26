/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datastructures.Arrays;

import java.util.Scanner;

/**
 *
 * @author Anuj Shah
 */
public class Arrays {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int inputSize = sc.nextInt();
        int[] array = new int[inputSize];
        for(int i = 0 ; i < inputSize ; i++){
            array[i] = sc.nextInt();
        }
        for(int i = inputSize -1; i >= 0 ; i--){
            System.out.print(array[i]+ " ");
        }
        
    }
}
