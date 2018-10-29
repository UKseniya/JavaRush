package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* One large and two small arrays
1. Create an array of 20 numbers.
    2. Read from keyboard 20 numbers and fill the array with them.
    3. Create two arrays of 10 numbers each.
    4. Copy numbers of the large array to two small arrays: the half of the numbers to the first array, the other half to the second one.
    5. Display to the screen the second small array. Each value should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[20];
        int smallArrayOne[] = new int[10];
        int smallArrayTwo[] = new int[10];

        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }

        for(int i = 0; i < smallArrayOne.length; i++){
            smallArrayOne[i] = array[i];
        }

        for(int i = 0; i < smallArrayTwo.length; i++){
            smallArrayTwo[i] = array[i+10];
            System.out.println(smallArrayTwo[i]);
        }

    }
}
