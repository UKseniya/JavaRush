package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 5 words in reverse order
Read from the keyboard 5 words. Add them into a string list and display them to the screen in reverse order.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < 5; i++){
            String s = reader.readLine();
            list.add(s);
        }

        for(int i = 0; i < list.size(); i++){
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }

    }
}
