package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Draw lines
Write a program that displays
    -	a horizontal line of 10 eights
    -	a vertical line of 10 eights
    Use “for” loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        int i = 8;

        for(int a = 0; a < 10; a++){
            System.out.print(i);
        }
        System.out.println("");
        for(int b = 0; b < 10; b++){
            System.out.println(i);
        }

    }
}
