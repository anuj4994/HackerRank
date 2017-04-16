/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Anuj Shah
 */
public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        if (a[a.length - 1] > b[0]) {
            System.out.println(0);
        } else {
            int lcm = 1;
            boolean found;
            for (int i = 1;; i++) {
                found = true;
                for (int x = 0; x < a.length; x++) {
                    if (i % a[x] != 0) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    lcm = i;
                    break;
                }
            }
            if (lcm == 0) {
                lcm = -1;
            }

            int smallest = b[b.length - 1];

            int gcd = 1;
            while (smallest > 1) {

                int modTot = 0;
                int counter = 0;

                while (counter < b.length) {
                    modTot += b[counter] % smallest;
                    counter++;
                }

                if (modTot == 0) {
                    gcd = smallest;
                    break;
                }

                smallest--;
            }

            int counter = 1;
            int c = 0;
            while (true) {
                int curr = lcm * counter;

                if (curr > b[0]) {
                    break;
                }

                if (gcd % curr == 0) {
                    c++;
                }
                counter++;
            }
            System.out.println(c);
        }
    }
}
