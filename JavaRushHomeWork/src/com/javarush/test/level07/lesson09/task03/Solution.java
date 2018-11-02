package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* The word «here»
1. Create a list of the words «stop», «look», «listen».
    2. Add a string containing «here» after each word.
    3. Display the result. Each element of list should be on a new line. Use “for” loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        ArrayList<String> list = new ArrayList<String>();
        String one = "stop";
        String two = "look";
        String three = "listen";
        list.add(one);
        list.add(two);
        list.add(three);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i) + " here");
        }

    }
}
