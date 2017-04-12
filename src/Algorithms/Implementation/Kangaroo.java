package Algorithms.Implementation;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Anuj Shah
 */
public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        boolean flag = false;
        int counter = 1;
        while (true) {
            int curr1 = x1 + counter * v1;
            int curr2 = x2 + counter * v2;
            if (curr1 == curr2) {
                flag = true;
                break;
            }
            if (v1 > v2) {
                if (curr1 > curr2) {
                    break;
                }
            } else {
                if (curr2 > curr1) {
                    break;
                }
            }
            counter++;
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
