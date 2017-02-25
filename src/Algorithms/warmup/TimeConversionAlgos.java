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
public class TimeConversionAlgos {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] splittedTime = time.split(":");
        int hours = Integer.parseInt(splittedTime[0]);
        int minutes = Integer.parseInt(splittedTime[1]);
        int seconds = Integer.parseInt(splittedTime[2].substring(0,2)); // It will take 2 digits of seconds from last part. 
        String ampm = splittedTime[2].substring(2); //It will take AM or PM from the String.
        if(ampm.equals("AM")){
            if(hours == 12){
                hours = 00;
            }
        } else {
            if(hours != 12){
               hours += 12;
            } 
            
        }
        System.out.println(String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds));
    }
}
