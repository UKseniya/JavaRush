package com.javarush.test.level03.lesson06.task03;

/* Seven colors of the rainbow
Write a program that displays seven colors of the rainbow.
    Two lines must have three colors. The third one must have just one color.
    Separate the colors in the lines by spaces.
*/

public class Solution
{
    public static void main(String[] args)
    {
        String one = "Red";
        String two = "Orange";
        String three = "Yellow";
        String four = "Green";
        String five = "Blue";
        String six = "Indigo";
        String seven = "Violet";
        System.out.println(one + " " + two + " " + three);
        System.out.println(four + " " + five + " " + six);
        System.out.println(seven);

    }
}