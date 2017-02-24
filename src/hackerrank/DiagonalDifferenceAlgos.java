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
public class DiagonalDifferenceAlgos {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int inputSize = Integer.parseInt(sc.nextLine());
        
        int[][] inputArray = new int[inputSize][inputSize];
        for(int i = 0 ; i < inputSize ;i++){
            String inputLine = sc.nextLine();
            String[] numbers = inputLine.split(" ");
            for(int j = 0 ; j < inputSize ; j++){
                inputArray[i][j] = Integer.parseInt(numbers[j]);
            }
        }
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        for(int i = 0 ; i < inputSize ; i ++){
            primaryDiagonal += inputArray[i][i];
            secondaryDiagonal += inputArray[i][inputSize - i - 1];
        }
        System.out.println(Math.abs(primaryDiagonal - secondaryDiagonal));
    }
}
