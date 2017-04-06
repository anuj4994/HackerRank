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
public class AlgorithmicCrush {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        long[] array = new long[arraySize];
        long queryLines = sc.nextInt();
        for(long i = 0 ; i < queryLines ; i++){
            System.out.println("Inhere" + i);
            int startingIndex = sc.nextInt();
            int endingIndex = sc.nextInt();
            int amount = sc.nextInt();
            for(int j = startingIndex-1 ; j < endingIndex ; j++){
                array[j] += amount;
            }
        }
        long max = 0;
        int index = 0;
        for(int i = 0 ; i < arraySize ; i++){
            if(array[i] > max){
                max = array[i];
                index = i;
            }
        }
        System.out.println(array[index]);
    }
}
