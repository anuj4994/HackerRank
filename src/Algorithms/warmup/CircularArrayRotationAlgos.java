/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anuj Shah
 */
public class CircularArrayRotationAlgos {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        int[] m = new int[q];
        for(int a_i=0; a_i < n; a_i++){
            a.add(in.nextInt());
        }
        
        Collections.rotate(a, k);
         
        for(int a0 = 0; a0 < q; a0++){
            m[a0] = in.nextInt();
        }
        for(int a0 = 0; a0 < q; a0++){
            System.out.println(a.get(m[a0]));
        }
    }
}
