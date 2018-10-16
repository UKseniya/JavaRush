package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Draw a triangle
Write a program that displays a right triangle composed of eights with sides 10 and 10. Use “for” loop.

    Example:
    8
    88
    888
    ...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        int i = 8;
        int j = 1;

        for(int a = 0; a < 10; a++){
            for(int b = 0; b < j; b ++){
                System.out.print(i);
            }
            System.out.println("");
            j++;
        }

    }
}
