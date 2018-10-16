package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Display an average
Write a program that reads from keyboard three numbers.
    The program should display to the screen the average of these numbers, that is, neither the biggest nor the smallest one.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int average;

        if(a > c && a < b)
            average = a;

        else if(b > a && b < c)
            average = b;

        else
            average = c;

        System.out.println(average);
    }
}
