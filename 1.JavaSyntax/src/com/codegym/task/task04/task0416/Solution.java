package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            double read = Double.parseDouble(br.readLine());
            read %= 5;
            boolean green = (read >= 0 && read < 3);
            boolean red = (read >= 4 && read < 5);
            boolean yellow = (read >= 3 && read < 4);
            if (red) {
                System.out.println("red");
            } else if (yellow) {
                System.out.println("yellow");
            } else if (green) {
                System.out.println("green");
            }
            //br.close();
    }
}