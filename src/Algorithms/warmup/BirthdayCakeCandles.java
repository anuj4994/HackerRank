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
public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int max = 0;
        int maxCount = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(height[height_i] > max){
                max = height[height_i];
                maxCount = 1;
            } else if( height[height_i] == max){
                maxCount++;
            }
        }
        System.out.println(maxCount);
    }
}
