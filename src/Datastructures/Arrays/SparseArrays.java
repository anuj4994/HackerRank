/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datastructures.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anuj Shah
 */
public class SparseArrays {
    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfInputString = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList();
        for(int i = 0 ; i < numberOfInputString ;i++){
            list.add(br.readLine());
        }
        int numberOfQuries = Integer.parseInt(br.readLine());
        List<String> queryList = new ArrayList();
        for(int i = 0 ; i < numberOfQuries ; i++){
            queryList.add(br.readLine());
        }
        for(int i = 0 ; i < queryList.size() ; i++){
            int count = 0;
            for(int j = 0 ; j < list.size() ; j++){
                if(queryList.get(i).equals(list.get(j))){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
