package com.codegym.task.task04.task0417;

/* 
Do we have a pair?

*/

import java.io.*;
import java.sql.Array;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[3];
        for (int i=0; i<arr.length; i++) {
            arr[i]=Integer.parseInt(read.readLine());
        }
         if(arr[0] == arr[1] && arr[1] == arr[2]) {
            System.out.println((arr[0]+ " " +arr[1]+ " " +arr[2]));
        } else if(arr[0] == arr[1]) {
            System.out.println(arr[0]+ " " +arr[1]);
        } else if (arr[1] == arr[2]) {
            System.out.println(arr[1]+ " " +arr[2]);
        } else if (arr[2] == arr[0]) {
            System.out.println(arr[2]+ " " +arr[0]);
        }
    }
}
