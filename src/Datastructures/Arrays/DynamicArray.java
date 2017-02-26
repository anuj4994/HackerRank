/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datastructures.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anuj Shah
 */
public class DynamicArray {
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
         String line1 = sc.nextLine();
         String a[] = line1.split(" ");
        int numberOfArrays = Integer.parseInt(a[0]);
        ArrayList<Integer>[] group = new ArrayList[numberOfArrays];
        for(int i = 0 ; i < numberOfArrays ; i ++){
            group[i] = new ArrayList<>();
        }
        int numberOfQuries = Integer.parseInt(a[1]);
        int lastAns = 0;
        
        for(int i = 0 ; i < numberOfQuries ; i++){
            String line = sc.nextLine();
            
            
            String[] numbers = line.split(" ");
            int qType = Integer.parseInt(numbers[0]);
            int seqValue = (Integer.parseInt(numbers[1]) ^ lastAns) % numberOfArrays;
            if(qType == 1) {
                group[seqValue].add(Integer.parseInt(numbers[2]));
            } else if(qType == 2) {
                lastAns = group[seqValue].get(Integer.parseInt(numbers[2]));
                System.out.println(lastAns);
            }
        }
        
    }
}
