/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anuj Shah
 */
public class MinMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long minSum = 0, maxSum = 0;
        List<Long> list = new ArrayList<>();
        for(int i = 0 ; i < 5; i++){
            list.add(in.nextLong());
        }
        Collections.sort(list);
        for(int i = 0 ; i < 5 ; i++){
            if(i<4)
                minSum += list.get(i);
            if(i > 0)
                maxSum += list.get(i);
        }
        System.out.println(minSum + " " + maxSum);
    }
}
