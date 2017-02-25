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
import java.util.List;

/**
 *
 * @author Anuj Shah
 */

/*
*Problem
*For this problem, we have types of queries you can perform on a List:

    Insert at index :

    Insert
    x y

    Delete the element at index :

    Delete
    x

Given a list, , of integers, perform queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer, (the initial number of elements in ).
The second line contains space-separated integers describing .
The third line contains an integer, (the number of queries).
The subsequent lines describe the queries, and each query is described over two lines:

    If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value must be inserted into at index .
    If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .

Constraints



    Each element in is a 32-bit integer.

Output Format

Print the updated list as a single line of space-separated integers.

Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0

Sample Output

0 1 78 12 23

Explanation

Insert 23 at index .

Delete the element at index .

Having performed all queries, we print as a single line of space-separated integers.
*/
public class HackerRank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List list = new ArrayList();
        String line = br.readLine();
        int initializeCapacity = Integer.parseInt(line);
        line = br.readLine();
        String[] numbers = new String[initializeCapacity];
        while(true){
            numbers = line.split(" ");
            if(numbers.length == initializeCapacity ){
                break;
            }
            line = br.readLine();
        }
        for(int i = 0 ; i < initializeCapacity ; i++){
            list.add(numbers[i]);
        }
        
        while(!(line = br.readLine()).isEmpty()){
            if(line.equals("Insert")){
                line = br.readLine();
                String[] temp = line.split(" ");
                if(temp.length == 2){
                    list.add(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
                }
            } else if(line.equals("Delete")) {
                line = br.readLine();
                String[] temp = line.split(" ");
                if(temp.length == 1){
                    list.remove(Integer.parseInt(temp[0]));
                } 
            }
        }
        for(int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i) +" ");
        }
    }
    
}
