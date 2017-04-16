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
        long[] array = new long[arraySize +1];
        long queryLines = sc.nextInt();
        for(int i = 1 ; i <= queryLines ; i++){
            int startingIndex = sc.nextInt();
            int endingIndex = sc.nextInt();
            int amount = sc.nextInt();
            array[startingIndex] += amount;
            if(endingIndex <  arraySize){
                array[endingIndex + 1] -= amount;
            }
        }
        long max = array[1];
        long sum = array[1];
        for(int i=2; i <= arraySize; i++) {
            sum+=array[i];
            if(max < sum) max = sum;
        }
        System.out.println(max);
    }
}
