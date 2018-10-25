package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Learning and practicing algorithms.
Task: Write a program that reads from keyboard 5 numbers and displays them in ascending order.
    Example input:
    3
    2
    15
    6
    17
    Example output:
    2
    3
    6
    15
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //add your code here
        List<Integer> inputs = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++){
            int input = Integer.parseInt(reader.readLine());
            inputs.add(input);
        }

        Collections.sort(inputs);

        for(Integer input : inputs){
            System.out.println(input);
        }
    }
}
