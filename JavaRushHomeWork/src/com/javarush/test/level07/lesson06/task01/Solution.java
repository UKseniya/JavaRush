package com.javarush.test.level07.lesson06.task01;

/* 5 different strings in a list
1. Create a list of strings.
    2. Add 5 different strings to the list.
    3. Display to the screen its size.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here

        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
