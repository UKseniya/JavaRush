package com.javarush.test.level03.lesson06.task02;

/* Multiplication table
Write a program that displays the multiplication table 10 by 10 as follows:
    1 2 3 …
    2 4 6 …
    3 6 9 …
    …
*/

public class Solution
{
    public static void main(String[] args)
    {
        int a = 1;
        int num = 1;

        while(num < 11){
            for(int i = 1; i < 11; i++) {
                a = num * i;
                System.out.print(a + " ");
            }
            System.out.println("");
            num = num + 1;
        }

    }
}