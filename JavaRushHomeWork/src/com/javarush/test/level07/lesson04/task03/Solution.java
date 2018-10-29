package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 arrays
1. Create one array of 10 strings.
    2. Create another array of 10 numbers.
    3. Read from the keyboard 10 strings and fill the string array with them.
    4. Write the length of a string from each cell of the string array in the cell of numbers array with the same index.
    Display to the screen the contents of the array of numbers. Each value should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string[] = new String[10];
        int numbers[] = new int[10];

        for(int i = 0; i < string.length; i++){
            string[i] = reader.readLine();
        }

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = string[i].length();
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
}
