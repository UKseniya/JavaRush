package com.javarush.test.level03.lesson06.task01;

/* Stop look listen
Write a program that displays all possible combinations of words «Stop», «Look», «Listen».
    Hint: there are 6 variants. Display each combination in a new line. Do not separate words.

    Example:
    LookListenStop
    ListenStopLook
    ...
*/

public class Solution
{
    public static void main(String[] args)
    {
        String a = "Stop";
        String b = "Look";
        String c = "Listen";

        System.out.println(a+b+c);
        System.out.println(a+c+b);
        System.out.println(b+a+c);
        System.out.println(b+c+a);
        System.out.println(c+b+a);
        System.out.println(c+a+b);

    }
}