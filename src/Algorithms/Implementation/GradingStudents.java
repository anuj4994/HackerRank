/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms.Implementation;

import java.util.Scanner;

/**
 *
 * @author Anuj Shah
 */
public class GradingStudents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            // your code goes here
            
            if(grade > 37){
                double temp = Math.ceil((double)grade/5);
                 
                int temp1 = (int)temp;
               
                if(((temp1 * 5) - grade) < 3){
                    grade = temp1 * 5;
                }
            }
             System.out.println(grade);
           
        }
        
    }
}
