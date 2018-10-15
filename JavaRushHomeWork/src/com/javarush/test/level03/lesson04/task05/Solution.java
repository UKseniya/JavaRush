package com.javarush.test.level03.lesson04.task05;

/* The sum of 10 numbers
Write a program that displays the sum of numbers from 1 to 10 by lines:
    1
    1+2=3
    1+2+3=6
    1+2+3+4=10
    …
    Example output:
    1
    3
    6
    10
    …
*/

public class Solution
{
    public static void main(String[] args)
    {
        int i = 1;
        for(int a = 0; a < 10; a++){
            i = i + a;
            System.out.println(i);
            i++;
        }

    }
}