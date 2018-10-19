package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Learning and practicing algorithm
Task: Write a program that
    1. reads from the console number N > 0
    2. then reads from the console N numbers
    3. displays the maximum of N numbers typed in.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int count = 0;

        //add your code here
        while (true)
        {
            int n = Integer.parseInt(reader.readLine());
            if(n > 0)
            {
                count = n;
                break;
            }
        }
        for(int i = 0; i < count; i++)
        {
            int a = Integer.parseInt(reader.readLine());
            if(a > maximum) maximum = a;
        }

        System.out.println(maximum);
    }
}
