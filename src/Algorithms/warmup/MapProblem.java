/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Anuj Shah
 */
/**
 * problem
 * The first line will have an integer denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.

After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.

Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.
*/
public class MapProblem {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap();
        String line = br.readLine();
        int initializeCapacity = Integer.parseInt(line);
        for(int i = 0 ; i < initializeCapacity ; i ++){
            String name = br.readLine();
            String number = br.readLine();
            if(number.length() == 10) 
                map.put(name , number);
        }
        System.out.println(map);
        ArrayList queryList = new ArrayList();
        while(!(line = br.readLine()).isEmpty()){
            queryList.add(line);
        }
        for(int i = 0 ; i < queryList.size() ; i++){
            if(map.containsKey(queryList.get(i))){
                System.out.println(map.get(queryList.get(i).toString()));
            } else {
                System.out.println("Not found");
            }
            
        }
    }
    
}
