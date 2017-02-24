/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Anuj Shah
 */
public class PlusMinusAlgos {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int inputSize = Integer.parseInt(sc.nextLine());
        float positive = 0, negative = 0, zero = 0;
        String inputLine = sc.nextLine();
        String[] numbers = inputLine.split(" ");
        for(int i = 0 ; i < inputSize ; i++){
            if(Integer.parseInt(numbers[i]) > 0){
                positive++;
            } else if(Integer.parseInt(numbers[i]) < 0){
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println(positive/inputSize);
        System.out.println(negative/inputSize);
        System.out.println(zero/inputSize);
    }
}
