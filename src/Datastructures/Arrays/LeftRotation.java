/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datastructures.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Anuj Shah
 */
public class LeftRotation {
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>(arraySize);
        int rotation = sc.nextInt();
        for(int i = 0 ; i < arraySize  ; i++) {
                a.add(sc.nextInt());
        }
        Collections.rotate(a, -rotation);
        
        for(int i = 0 ; i < arraySize ; i++) {
            System.out.print(a.get(i) + " ");
        }
        
       
    }
}
