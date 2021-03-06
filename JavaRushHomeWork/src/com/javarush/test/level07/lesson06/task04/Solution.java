package com.javarush.test.level07.lesson06.task04;

/* Add 5 strings to the beginning of the list
1. Create a list of strings.
    2. Read from the keyboard 5 strings. Add these strings to the beginning of the list, not to the end.
    3. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < 5; i++){
            String s = reader.readLine();
            list.add(0, s);
        }

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
