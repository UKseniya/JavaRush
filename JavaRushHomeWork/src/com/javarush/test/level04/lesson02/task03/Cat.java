package com.javarush.test.level04.lesson02.task03;

/* Implement method setCatsCount()
Implement the setCatsCount method, so the value of the catsCount variable would be equal to the passed parameter.
*/

public class Cat {
    private static int catsCount = 0;

    public static void main(String[] args)
    {

    }

    public static void setCatsCount(int catsCount) {
        //add your code here
       Cat.catsCount = catsCount;
    }
}
