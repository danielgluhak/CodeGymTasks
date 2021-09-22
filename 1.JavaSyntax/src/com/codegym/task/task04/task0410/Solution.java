package com.codegym.task.task04.task0410;

/* 
Come on, lucky seven!

*/

import javax.swing.text.html.Option;

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        String interval = ((a>50) && (a<100)) ? "The number " + a + " is in the interval." : "The number " + a + " is not in the interval.";
        System.out.println(interval);
    }
}