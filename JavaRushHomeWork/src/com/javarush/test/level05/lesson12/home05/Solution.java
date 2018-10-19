package com.javarush.test.level05.lesson12.home05;

/* Read numbers from keyboard and calculate their total
Read numbers from keyboard and calculate their total until the user enters the word «total».
Display to the screen the total.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while(true){
            String s = reader.readLine();
            if(s.equals("сумма")) break;
            int i = Integer.parseInt(s);
            sum = sum + i;

        }
        System.out.print(sum);
    }
}
