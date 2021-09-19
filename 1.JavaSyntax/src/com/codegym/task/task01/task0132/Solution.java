package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }


    public static int sumDigitsInNumber(int number) {
        int num1 = number%10;
        int num2 = (number/10)%10;
        int num3 = number/100;
        return num1+num2+num3;


        }
    }
