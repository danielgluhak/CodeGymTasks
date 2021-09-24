package com.codegym.task.task04.task0418;

/* 
Minimum of two numbers

*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOne = Integer.parseInt(br.readLine());
        int numTwo = Integer.parseInt(br.readLine());

        System.out.println(numOne <= numTwo ? numOne:numTwo);
    }
}